package com.hss01248.beanvalidator;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;



import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.metadata.ConstraintDescriptor;

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
        validatorFactory = Validation
                .byDefaultProvider()
                .configure()
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

    private static String readDefaultMsg(String template) {
        Log.d("interpolate",template);
        template = template.replace("{","")
                .replace("}","")
                .replace("org.hibernate.validator.constraints.","")
                .replace("javax.validation.constraints.","")
                .toLowerCase()
                .replace(".","_");
        Log.d("interpolate2",template);
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
        if(bean == null){
            return "";
        }
        if(notJavaBean(bean)){
            return "";
        }

        try {
            String errorMsg= "";
            if(bean instanceof List){
                List list = (List) bean;
                if(!list.isEmpty()){
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < list.size(); i++) {
                        Object obj = list.get(i);
                            String msg = validateRealBean(obj);
                            if(!TextUtils.isEmpty(msg)){
                                sb.append("posion:")
                                        .append(i)
                                        .append(" :")
                                        .append(msg)
                                        .append("\n");
                            }
                    }
                    errorMsg = sb.toString();
                }
            }else if(bean.getClass().isArray()){
                Object[] arr = (Object[]) bean;
                if( arr.length>0){
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < arr.length; i++) {
                        Object obj = arr[i];
                        String msg = validateRealBean(obj);
                        if(!TextUtils.isEmpty(msg)){
                            sb.append("posion:")
                                    .append(i)
                                    .append(" :")
                                    .append(msg)
                                    .append("\n");
                        }
                    }
                    errorMsg = sb.toString();
                }

            }else {
                errorMsg =  validateRealBean(bean);
            }
            Log.w("validate","end\nmsg:"+ errorMsg);
            return errorMsg;
        }catch (Throwable throwable){
            throwable.printStackTrace();
            return "";
        }



    }

    private static <T> String validateRealBean(@NotNull T bean ) {
        if(bean == null){
            return "";
        }
        if(notJavaBean(bean)){
            return "";
        }
        Class clazz = bean.getClass();
        Log.w("validate","bean.getClass():"+clazz);
        boolean needValidate =  clazz.getAnnotation(NeedValidate.class)  != null;
        if(!needValidate){
            Log.w("validate","没有NeedValidate注解,不需要校验");
            return "";
        }

        if(validatorFactory == null){
            return "";
        }
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
        return str;
    }

    private static <T> boolean notJavaBean(T bean) {

        if(bean instanceof String){
            return false;
        }
        if(bean instanceof Map){
            return true;
        }
        Class clazz = bean.getClass();
        if(clazz.isPrimitive()){
            return true;
        }
        if(clazz.isEnum()){
            return true;
        }
        return false;
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
