package com.hao.d8_Object;

/**
Object类：一个类要么直接继承了Object类，要么间接继承了Object类，Object是Java中的祖宗类，Object类的方法是一切子类都可以直接使用的*/

public class Test {
    public static void main(String[] args) {

        /**public String toString()      默认返回当前对象在堆内存中的地址信息：类的全限名@内训地址
            意义在于被子类重写，以便返回对象的内容信息，而不是地址信息 */
        Student s = new Student("zhang","m",19);
        System.out.println(s.toString());       //toString被重写，直接输出对象变量，默认可以省略toString调用不写的
        System.out.println(s);

        /**public Boolean equals(Object o)       默认是比较当前对象与另一个对象的地址是否相同，相同返回true,不同返回false   */
        Student s1  = new Student("zhang","w",19);
        Student s2  = new Student("zhang","w",19);
        System.out.println(s1.equals(s2));      //equals函数被重写，内容一致则输出true
    }
}
