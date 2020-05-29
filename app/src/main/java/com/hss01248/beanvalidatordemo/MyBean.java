package com.hss01248.beanvalidatordemo;

import com.hss01248.beanvalidator.NeedValidate;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * by hss
 * data:2020-05-18
 * desc:
 */
@NeedValidate
public class MyBean {
    @NotEmpty(message = "error_empty")
    @Size(min = 1, max = 16,message = "not_fit_length")
    public String name;


    @Size(min = 6, max = 12)
    public String password;
}
