package com.hss01248.beanvalidatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.hss01248.beanvalidator.BeanValidator;
import com.hss01248.gsonconverter.validator.GsonConverterFactoryWithBeanValidator;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validateBean(View view){
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

    public void retrofit(View view){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactoryWithBeanValidator.create())
                .baseUrl("https://api.github.com/")
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        Call<List<Repo>> repos = service.listRepos("octocat");
        repos.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                Log.d("success",new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    public void report(View view){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Reporter.report();
            }
        }).start();

    }


}
