package com.hss01248.beanvalidator;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;


import org.hibernate.validator.HibernateValidator;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator;
import javax.validation.Validation;
import javax.validation.ValidationProviderResolver;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.metadata.ConstraintDescriptor;
import javax.validation.spi.ValidationProvider;

/**
 * by hss
 * data:2020-05-18
 * desc:不能混淆string资源. 如果使用andresgruard,可以将验证翻译放到同一个xml文件中,然后添加忽略
 */
public class BeanValidator {
    private static ValidatorFactory validatorFactory;
    private static Application app;
    static Validator validator;

    public static void init(final Application app){
        BeanValidator.app = app;
        if(validatorFactory != null){
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                validatorFactory = Validation
                        .byDefaultProvider()
                        .providerResolver(new ValidationProviderResolver() {
                            @Override
                            public List<ValidationProvider<?>> getValidationProviders() {
                                List<ValidationProvider<?>> list = new ArrayList<>();
                                list.add(new HibernateValidator());
                                return list;
                            }
                        })
                        .configure()
                        .addProperty( "hibernate.validator.fail_fast", isDebugMode() ? "false": "true"  )
                        .ignoreXmlConfiguration()
                        .messageInterpolator(new MessageInterpolator() {
                            @Override
                            public String interpolate(String messageTemplate, MessageInterpolator.Context context) {

                                try {
                                    //自己配的
                                    int id = app.getResources().getIdentifier(messageTemplate, "string", app.getPackageName());
                                    return app.getString(id);
                                }catch (Throwable throwable){
                                    //库里默认的
                                    //throwable.printStackTrace();
                                    return readDefaultMsg(messageTemplate);
                                }

                                //return messageTemplate;
                            }

                            @Override
                            public String interpolate(String messageTemplate, Context context, Locale locale) {
                                return interpolate(messageTemplate, context);
                            }
                        })
                        .buildValidatorFactory();
            }
        };
        if(isDebugMode()){
            runnable.run();
        }else {
            try {
                runnable.run();
            }catch (Throwable throwable){
                throwable.printStackTrace();
            }
        }
    }

    private static int sIsDebugMode = -1;
    public static boolean isDebugMode() {
        if (sIsDebugMode == -1) {
            boolean isDebug = app.getApplicationInfo() != null
                    && (app.getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
            sIsDebugMode = isDebug ? 1 : 0;
        }
        return sIsDebugMode == 1;
    }

    private static String readDefaultMsg(String template) {
        if(isDebugMode()){
            Log.d("interpolate",template);
        }

        template = template.replace("{","")
                .replace("}","")
                .replace("org.hibernate.validator.constraints.","")
                .replace("javax.validation.constraints.","")
                .toLowerCase()
                .replace(".","_");
        if(isDebugMode()){
            Log.d("interpolate2",template);
        }

        try {
            //自己配的
            int id = app.getResources().getIdentifier(template, "string", app.getPackageName());
            return app.getString(id);
        }catch (Throwable throwable){
            //库里默认的
            //throwable.printStackTrace();
            return template;
        }
    }

    /**
     *
     * @param bean
     * @return 返回为空,则
     */
    public static <T> String validate(@NotNull T bean) {
        if(validatorFactory == null){
            return "";
        }
        try {
            if(validator == null){
                validator = validatorFactory.getValidator();
            }

            final Set<ConstraintViolation<T>> constraintViolations = validator.validate(bean);
            if(constraintViolations == null || constraintViolations.isEmpty()){
                return "";
            }

            StringBuilder sb = new StringBuilder();
            for (final ConstraintViolation<T> violation : constraintViolations) {
                String str = String.format(app.getResources().getString(R.string.bean_validate_common_msg),
                        violation.getPropertyPath(),getValueStr(violation.getInvalidValue()),violation.getMessage(),
                        getRuleStr(violation));
                sb.append(str).append("\n");
            }
            String str = sb.toString();
            if(isDebugMode()){
                Log.w("validate","88\n"+ str);
            }

            return str;
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return "";
        }



    }

    private static Object getValueStr(Object invalidValue) {
        if(invalidValue == null){
            return "null";
        }
        if("".equals(invalidValue)){
            return "空字符串";
        }
        return invalidValue+"";
    }

    private static Object getRuleStr(ConstraintViolation violation) {
        ConstraintDescriptor descriptor = violation.getConstraintDescriptor();
        if(descriptor == null){
            return "";
        }
       Annotation annotation =   descriptor.getAnnotation();
        if(annotation == null){
            return "";
        }
        String str = annotation.toString();
        str = str.replace("groups=[], ","")
                .replace(", payload=[]","")
                .replace("org.hibernate.validator.constraints.","")
                .replace("javax.validation.constraints.","");
        str = str.replaceAll("message=.* {1}","")
                .replaceAll("message=.*\\){1}",")");
        return str;
    }
}
