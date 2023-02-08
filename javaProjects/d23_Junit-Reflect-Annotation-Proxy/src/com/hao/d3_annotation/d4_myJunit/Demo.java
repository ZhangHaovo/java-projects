package com.hao.d3_annotation.d4_myJunit;

import java.lang.reflect.Method;

public class Demo {

    @MyTest
    public void test1(){
        System.out.println("===test1===");
    }

    @MyTest
    public void test2(){
        System.out.println("===test1===");
    }

    /**启动菜单*/
    public static void main(String[] args) throws Exception {
        Demo d = new Demo();

        Class c = Demo.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                /**运行MyTest注解的方法*/
                method.invoke(d);
            }
        }
    }
}
