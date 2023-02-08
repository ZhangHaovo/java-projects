package com.hao.d3_annotation.d4_myJunit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)     //元注解
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {
}
