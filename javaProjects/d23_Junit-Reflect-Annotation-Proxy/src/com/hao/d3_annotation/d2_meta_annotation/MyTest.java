package com.hao.d3_annotation.d2_meta_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**元注解*/
@Target({ElementType.METHOD,ElementType.FIELD})     //限制MyTest只能注解方法和成员变量
@Retention(RetentionPolicy.RUNTIME)         //生命周期为源码阶段，字节码文件阶段，运行阶段
public @interface MyTest {

}
