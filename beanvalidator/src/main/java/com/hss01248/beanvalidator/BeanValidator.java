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



/**
 * by hss
 * data:2020-05-18
 * desc:不能混淆string资源. 如果使用andresgruard,可以将验证翻译放到同一个xml文件中,然后添加忽略
 */
public class BeanValidator {

    public static Application app;
    static IValidateBean validator;
    /**
     * 全局开关控制
     */
    public static boolean globalSwitch = true;

    public static void init(final Application app,IValidateBean validator){
        BeanValidator.app = app;
        BeanValidator.validator = validator;
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
        if(validator == null){
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
        return validator.validateRealBean(bean);
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

    /*private static Object getRuleStr(ConstraintViolation violation) {
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
    }*/
}
