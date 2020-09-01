package com.hss01248.android.apacheval;

import com.hss01248.beanvalidator.BeanValidator;
import com.hss01248.beanvalidator.IValidateBean;

import org.apache.bval.jsr.ApacheValidationProvider;

import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.metadata.ConstraintDescriptor;


public class ApacheBvalImpl implements IValidateBean {
    private static ValidatorFactory validatorFactory;
    static Validator validator;

    @Override
    public <T> String validateRealBean(T bean) {
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

    private ValidatorFactory init() {
        validatorFactory = Validation
                .byProvider(ApacheValidationProvider.class)
                .configure()
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
}
