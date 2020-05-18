package com.hss01248.beanvalidatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.hss01248.beanvalidator.BeanValidator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyBean bean = new MyBean();
        bean.name = "";
        bean.password = "9";

        //Debug.startMethodTracing(getExternalFilesDir("method").getAbsolutePath());
        long start = System.currentTimeMillis();
        String errorMsg = BeanValidator.validate(bean);
        Log.d("dd","bean校验耗时:"+(System.currentTimeMillis() - start)+"ms");
        //Debug.stopMethodTracing();
        if(!TextUtils.isEmpty(errorMsg)){
            Toast.makeText(this,errorMsg,Toast.LENGTH_LONG).show();
        }else {
            //拿到合格的bean
        }
    }


}
