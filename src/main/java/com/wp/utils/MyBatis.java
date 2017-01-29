package com.wp.utils;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by admin on 2016/10/7.
 */
@Retention(RetentionPolicy.RUNTIME)//定义元注解的保留策略
@Target(ElementType.TYPE)//定义注解的作用目标 Type包括类接口
@Documented//说明该注解类被包含在javadoc中
@Component//定义为主键   然后在spring-context中配置
public @interface MyBatis {
}
