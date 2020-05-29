package com.hss01248.gsonconverter.validator;

import java.io.IOException;

/**
 * by hss
 * data:2020/5/29
 * desc:
 */
public class BeanValidateException extends IOException {
    public BeanValidateException() {
    }

    public BeanValidateException(String message) {
        super(message);
    }

    public BeanValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanValidateException(Throwable cause) {
        super(cause);
    }
}
