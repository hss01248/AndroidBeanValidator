# Hibernate Validator on Android

[![](https://jitpack.io/v/hss01248/AndroidBeanValidator.svg)](https://jitpack.io/#hss01248/AndroidBeanValidator)

## 适用场景

拿到后台数据后,如何更高效地校验数据有效性,而不是在代码里写一堆if else判断?

Bean Validation 2.0（JSR 380）定义了用于实体和方法验证的元数据模型和API，Hibernate Validator是目前最好的实现.

参考:

https://stackoverflow.com/questions/29315472/android-and-hibernate-validator-it-is-possible-to-use-together

http://hibernate.org/validator/documentation/





# 使用



## 初始化

```
BeanValidator.init(this);
```

## 使用

![image-20200529144724999](http://hss01248.tech/uPic/2020-05-29-14-47-26-image-20200529144724999.png)



## 提供了中英文的默认文案:

![image-20200529144800253](http://hss01248.tech/uPic/2020-05-29-14-48-01-image-20200529144800253.png)

![image-20200529144823249](http://hss01248.tech/uPic/2020-05-29-14-48-24-image-20200529144823249.png)





## 自定义配置文案:

![image-20200529144851858](http://hss01248.tech/uPic/2020-05-29-14-48-53-image-20200529144851858.png)





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



## retrofit使用

```
Retrofit retrofit = new Retrofit.Builder()
        .addConverterFactory(GsonConverterFactoryWithBeanValidator.create())
```



![image-20200529145402034](http://hss01248.tech/uPic/2020-05-29-14-54-03-image-20200529145402034.png)

## 返回的msg的格式: 

可以直接显示给用户

![image-20200529145018717](http://hss01248.tech/uPic/2020-05-29-14-50-20-image-20200529145018717.png)

# gradle使用:

```java
implementation 'com.github.hss01248.AndroidBeanValidator:beanvalidator:1.0.1'
implementation 'com.github.hss01248.AndroidBeanValidator:gsonconvertervalidator:1.0.1'

```

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

![image-20200529144936189](http://hss01248.tech/uPic/2020-05-29-14-49-37-image-20200529144936189.png)

应该放到网络框架json解析的下一步,不要放到主线程





## hibernate的校验模式

上面例子中一次性返回了所有验证不通过的集合，通常按顺序验证到第一个字段不符合验证要求时，就可以直接拒绝请求了。Hibernate Validator有以下两种验证模式：



### 1、普通模式（默认是这个模式）

　　普通模式(会校验完所有的属性，然后返回所有的验证失败信息)



### 2、快速失败返回模式

　　快速失败返回模式(只要有一个验证失败，则返回)

两种验证模式配置方式：（[参考官方文档](https://docs.jboss.org/hibernate/stable/validator/reference/en-US/html_single/#section-provider-specific-settings)）

failFast：true 快速失败返回模式  false 普通模式 

```
.addProperty( "hibernate.validator.fail_fast", isDebugMode() ? "false": "true"  )
```

![image-20200529145108074](http://hss01248.tech/uPic/2020-05-29-14-51-09-image-20200529145108074.png)



# 兼容性

## 首先配置

```
.ignoreXmlConfiguration()
```

## 在低版本(api16,19)上报找不到Log_$logger;

```
IllegalArgumentException: Invalid logger interface org.hibernate.validator.internal.util.logging.Log (implementation not found)
```

解决方法: 将Log_$logger拷出来,包路径不变,类名改成常规名字即可:

![image-20200529145128566](http://hss01248.tech/uPic/2020-05-29-14-51-29-image-20200529145128566.png)



注意要编译成功,还需要依赖:

```
implementation group: 'javax.xml', name: 'jaxb-api', version: '2.1'
implementation group: 'javax.annotation', name: 'javax.annotation-api', version: '1.3.1'
```

## 至此,可兼容到api16

