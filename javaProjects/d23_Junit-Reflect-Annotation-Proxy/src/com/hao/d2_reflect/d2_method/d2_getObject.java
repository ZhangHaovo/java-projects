package com.hao.d2_reflect.d2_method;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**使用反射技术获取构造器对象并使用
 获取构造器的作用依然是初始化一个对象返回*/

public class d2_getObject {
    @Test
    public void getDeclaredConstructor() throws Exception{
        Class c = Student.class;
        Constructor constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        /**若遇到私有的构造器，可以暴力反射*/
        constructor.setAccessible(true);
        /**根据指定的构造器创建对象 T newInstance(Object... initargs)*/
        Student s = (Student) constructor.newInstance();
        System.out.println(s);

        Constructor constructor1 = c.getDeclaredConstructor(String.class,int.class);
        Student s1 = (Student) constructor1.newInstance("张三",1000);
        System.out.println(s1);
    }
}
