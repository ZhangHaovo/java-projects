package com.hao.d3_annotation.d3_annotation_analysis;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;


/**注解的解析:注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，存在注解就解析出内容。
 *
 * 与注解解析相关的接口:
 * Annotation: 注解的顶级接口，注解都是Annotation类型的对象
 * AnnotatedElement:该接口定义了与注解解析相关的解析方法
 *
 * 所有的类成分Class, Method , Field , Constructor，都实现了AnnotatedElement接口他们都拥有解析注解的能力：
 *
 * 解析注解的技巧:
 * 注解在哪个成分上，我们就先拿哪个成分对象。
 *  比如注解作用成员方法，则要获得该成员方法对应的Method对象，再来拿上面的注解
 *  比如注解作用在类上，则要该类的Class对象，再来拿上面的注解
 *  比如注解作用在成员变量上，则要获得该成员变量对应的Field对象，再来拿上面的注解
 * */
public class Demo {

    /**获取类上的解析*/
    @Test
    public void parseClass(){
        /**先得到类对象*/
        Class c = BookStore.class;
        /**判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false boolean isAnnotationPresent(Class<Annotation> annotationClass)*/
        if (c.isAnnotationPresent(Book.class)){
            /**获取该注解对象 T getDeclaredAnnotation(Class<T> annotationClass)*/
            Book book = (Book)c.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

    /**获取方法上的解析*/
    @Test
    public void parseMethod() throws Exception {
        /**先得到方法对象*/
        Class c = BookStore.class;
        Method m = c.getDeclaredMethod("test");
        /**判断这个方法上是否存在这个注解*/
        if (m.isAnnotationPresent(Book.class)){
            /**获取该注解对象 T getDeclaredAnnotation(Class<T> annotationClass)*/
            Book book = (Book)m.getDeclaredAnnotation(Book.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }
}
