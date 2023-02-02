package com.hao.d1_package;

import com.hao.d1_package.inner.Student;


public class Test {
    public static void main(String[] args) {

        //同一包下的类，可以相互之间直接访问
        System.out.println(People.a);

        //不同包下的类，必须要先导包才可以访问
        Student s = new Student();

        //如果这个类中使用不同包下的相同的类名，此时默认只能导入一个类的包，另一个类要使用全名访问
        com.hao.d1_package.inner2.Student s1 = new com.hao.d1_package.inner2.Student();

    }
}
