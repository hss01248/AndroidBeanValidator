# Hibernate Validator on Android

## 场景

拿到后台数据后,如何更高效地校验数据有效性,而不是在代码里写一堆if else判断?

Bean Validation 2.0（JSR 380）定义了用于实体和方法验证的元数据模型和API，Hibernate Validator是目前最好的实现

参考:

https://stackoverflow.com/questions/29315472/android-and-hibernate-validator-it-is-possible-to-use-together





# 使用



![image-20200518152652333](/Users/hss/aku/BeanValidatordemo/image-20200518152652333.png)



## 初始化

```
BeanValidator.init(this);
```

## 使用

```
@NeedValidate加到类上,不加代表不开启bean校验
```

![image-20200518152741233](/Users/hss/aku/BeanValidatordemo/image-20200518152741233.png)

## 提供了中英文的默认文案:

![image-20200518153928700](/Users/hss/aku/BeanValidatordemo/image-20200518153928700.png)

![image-20200518152831874](/Users/hss/aku/BeanValidatordemo/image-20200518152831874.png)



## 自定义配置文案:

![image-20200518152852237](/Users/hss/aku/BeanValidatordemo/image-20200518152852237.png)



## 校验:

```

String errorMsg = BeanValidator.validate(bean);
//返回的errorMsg为空就说明校验通过
if(!TextUtils.isEmpty(errorMsg)){
    Toast.makeText(this,errorMsg,Toast.LENGTH_LONG).show();
}else {
    //拿到合格的bean
}
```

## 在retrofit中的使用:

```
Retrofit retrofit = new Retrofit.Builder()
        .addConverterFactory(GsonConverterFactoryWithBeanValidator.create())
```



# gradle 引用:



# 注意

不能混淆相关的string资源. 

如果使用微信的资源混淆工具andresgruard,可以将验证翻译放到同一个xml文件中,然后添加忽略.

比如:

```
andResGuard {
    use7zip = false
    useSign = true
    // it will keep the origin path of your resources when it's true
    keepRoot = false
    whiteList = [
            "R.string.validator_msg",
            ....
```







# 方法耗时

100-300ms

主要耗时是框架内部反射.

应该放到网络框架json解析的下一步,不要放到主线程

![image-20200518153102618](/Users/hss/aku/BeanValidatordemo/image-20200518153102618.png)

