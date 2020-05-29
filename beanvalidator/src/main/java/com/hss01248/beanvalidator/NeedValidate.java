package com.hss01248.beanvalidator;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * by hss
 * data:2020/5/29
 * desc:
 */
@Target({ TYPE })
@Retention(RUNTIME)
public @interface NeedValidate {
}
