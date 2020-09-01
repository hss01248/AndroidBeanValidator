package com.hss01248.beanvalidator;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;



import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.validation.Configuration;
import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.metadata.ConstraintDescriptor;


/**
 * by hss
 * data:2020-05-18
 * desc:不能混淆string资源. 如果使用andresgruard,可以将验证翻译放到同一个xml文件中,然后添加忽略
 */
public class BeanValidator {

     static Application app;
     static ValidatorFactory validatorFactory;
    static Validator validator;
    /**
     * 全局开关控制
     */
    public static boolean globalSwitch = true;

    public static void init(final Application app){
        BeanValidator.app = app;
    }

    public static String readDefaultMsg(String template) {
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
            if(id == 0){
                return template;
            }
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
     * @return 返回错误信息,如果返回空,则代表校验通过
     */
    public static <T> String validate( T bean) {
        if(!globalSwitch){
            return "";
        }
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
                                        .append(" in list:")
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
                                    .append(" in array:")
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

    private static <T> String validateRealBean( T bean ) {
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
            validatorFactory = init();
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
            String str = String.format(BeanValidator.app.getResources().getString(com.hss01248.beanvalidator.R.string.bean_validate_common_msg),
                    violation.getPropertyPath(),getValueStr(violation.getInvalidValue()),violation.getMessage(),
                    getRuleStr(violation));
            sb.append(str).append("\n");
        }
        String str = sb.toString();
        return str;
    }

    private static ValidatorFactory init() {
        Configuration configuration =  null;
        try {
            Class clazz = Class.forName("org.apache.bval.jsr.ApacheValidationProvider");
            configuration = Validation
                    .byProvider(clazz)
                    .configure();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            configuration = Validation
                    .byDefaultProvider()
                    .configure();
        }
        validatorFactory = configuration
                .ignoreXmlConfiguration()
                .messageInterpolator(new MessageInterpolator() {
                    @Override
                    public String interpolate(String messageTemplate, MessageInterpolator.Context context) {

                        try {
                            //自己配的
                            int id = BeanValidator.app.getResources().getIdentifier(messageTemplate, "string", BeanValidator.app.getPackageName());
                            if(id == 0){
                                return BeanValidator.readDefaultMsg(messageTemplate);
                            }
                            return BeanValidator.app.getString(id);
                        }catch (Throwable throwable){
                            //库里默认的
                            //throwable.printStackTrace();
                            return BeanValidator.readDefaultMsg(messageTemplate);
                        }

                        //return messageTemplate;
                    }

                    @Override
                    public String interpolate(String messageTemplate, MessageInterpolator.Context context, Locale locale) {
                        return interpolate(messageTemplate, context);
                    }
                })
                .buildValidatorFactory();
        return validatorFactory;
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
