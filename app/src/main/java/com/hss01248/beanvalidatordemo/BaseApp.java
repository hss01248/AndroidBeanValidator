package com.hss01248.beanvalidatordemo;

import android.app.Application;

import com.hss01248.android.hibernateval.HibernateValImpl;
import com.hss01248.beanvalidator.BeanValidator;


/**
 * by hss
 * data:2020-05-18
 * desc:
 */
public class BaseApp extends Application {

   public static BaseApp app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        BeanValidator.init(this,new HibernateValImpl());
    }


}
