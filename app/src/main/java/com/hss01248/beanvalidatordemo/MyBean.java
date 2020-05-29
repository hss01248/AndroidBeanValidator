package com.hss01248.beanvalidatordemo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * by hss
 * data:2020-05-18
 * desc:
 */
public class MyBean {
    @NotEmpty(message = "error_empty")
    @Size(min = 1, max = 16,message = "not_fit_length")
    //@Pattern(regexp = "[a-zA-Z0-9]+")
    public String name;
    @NotEmpty()
    @Size(min = 6, max = 12)
    public String password;
}
