package com.hao.d3_annotation.d1_create_annotation;
/***注解概述、作用
 *Java 注解（Annotation）又称 Java 标注，是 JDK5.0 引入的一种注释机制。
 * Java 语言中的类、构造器、方法、成员变量、参数等都可以被注解进行标注。
 * 对Java中类、方法、成员变量做标记，然后进行特殊处理，至于到底做何种处理由业务需求来决定。
 */

/**自定义注解 --- 自定义注解就是自己做一个注解来使用。
 * public @interface 注解名称 {
 * public 属性类型 属性名() default 默认值 ;
 * }
 *
 *特殊属性:
 * -value属性，如果只有一个value属性的情况下，使用value属性的时候可以省略value名称不写!!
 * -但是如果有多个属性,  且多个属性没有默认值，那么value名称是不能省略的。
 */

@MyBook(name = "《西游记》",authors = {"吴承恩","张三"},price = 199)
public class demo {
//    @Book(value = "123")
    @Book("123")
    public static void main(String[] args) {

    }

}
