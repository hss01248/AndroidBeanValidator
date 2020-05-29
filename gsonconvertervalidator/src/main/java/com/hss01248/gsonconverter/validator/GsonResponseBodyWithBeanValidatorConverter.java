package com.hss01248.gsonconverter.validator;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.hss01248.beanvalidator.BeanValidator;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * by hss
 * data:2020/5/29
 * desc:
 */
public class GsonResponseBodyWithBeanValidatorConverter <T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final TypeAdapter<T> adapter;

    public GsonResponseBodyWithBeanValidatorConverter(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {

        JsonReader jsonReader = gson.newJsonReader(value.charStream());
        try {
            T result = adapter.read(jsonReader);
            if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            //增加校验
            String errorMsg = BeanValidator.validate(result);
            if(!TextUtils.isEmpty(errorMsg)){
                throw new BeanValidateException(errorMsg);
            }
            return result;
        } finally {
            value.close();
        }
    }
}
