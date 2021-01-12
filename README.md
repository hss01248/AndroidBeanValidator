# Bean Validator on Android

[![](https://jitpack.io/v/hss01248/AndroidBeanValidator.svg)](https://jitpack.io/#hss01248/AndroidBeanValidator)

## 适用场景

拿到后台数据后,如何更高效地校验数据有效性,而不是在代码里写一堆if else判断?

![image-20200901150246361](http://hss01248.tech/uPic/2020-09-01-15-02-47-image-20200901150246361.png)



> 要移植到Android,需要考虑java8兼容性问题,性能(方法耗时),以及对apk大小的影响,默认使用的是Apache BVal 1.1.2



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
implementation 'com.github.hss01248.AndroidBeanValidator:apacheval:1.0.2'//默认使用Apache BVal
  //如果使用hibernate:
  implementation 'com.github.hss01248.AndroidBeanValidator:hibernateval:1.0.2'
implementation 'com.github.hss01248.AndroidBeanValidator:gsonconvertervalidator:1.0.2'

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





# apk

大小相差不大

![image-20200901144216387](http://hss01248.tech/uPic/2020-09-01-14-42-16-image-20200901144216387.png)

# 方法耗时

Apache Bval

第一次初始化validate factory比较耗时,后续很快

![image-20200901143534698](http://hss01248.tech/uPic/2020-09-01-14-35-36-image-20200901143534698.png)









# ps.hibernate的兼容



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

## 兼容性

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



# 代码库:

[AndroidBeanValidator](https://github.com/hss01248/AndroidBeanValidator)

# 参考:

[不吹不擂，提升你对BeanValidation数据校验的认知](https://www.toutiao.com/i6865868352225706508/?timestamp=1598943642&app=news_article&group_id=6865868352225706508&use_new_style=1&req_id=2020090115004201002202707421020F17)

[SpringMVC中实现Bean Validation(JSR 303 JSR 349 JSR 380)](https://blog.csdn.net/weixin_30399155/article/details/101420321)

https://stackoverflow.com/questions/29315472/android-and-hibernate-validator-it-is-possible-to-use-together

http://hibernate.org/validator/documentation/

