package com.hss01248.beanvalidator;

import android.app.Application;

public interface IValidateBean {

    <T> String validateRealBean( T bean );
}
