# Hibernate Validator on Android

## purpose

拿到后台数据后,如何更高效地校验数据有效性,而不是在代码里写一堆if else判断?

Bean Validation 2.0（JSR 380）定义了用于实体和方法验证的元数据模型和API，Hibernate Validator是目前最好的实现

参考:

https://stackoverflow.com/questions/29315472/android-and-hibernate-validator-it-is-possible-to-use-together

http://hibernate.org/validator/documentation/





# 使用



![image-20200518152652333](/Users/hss/aku/BeanValidatordemo/image-20200518152652333.png)



## 初始化

```
BeanValidator.init(this);
```

## 使用

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



![image-20200518160247483](/Users/hss/github/AndroidBeanValidator/image-20200518160247483.png)

![image-20200518160307881](/Users/hss/github/AndroidBeanValidator/image-20200518160307881.png)



# 兼容性

api 16-19初始化会失败