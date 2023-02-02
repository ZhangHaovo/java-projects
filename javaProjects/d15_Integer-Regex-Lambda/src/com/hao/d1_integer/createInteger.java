package com.hao.d1_integer;
/*
包装类：将8种基本类型提供了相对应的应用类型（注意：int -> integer    char -> Character）
    1.特点：包装类型变量可以直接赋值给基本数据类型的变量，反之基本数据类型变量可以直接赋值给包装类型的变量
    2.特有功能：
        （1）.包装类型的默认值可以是null,容错率更高
        （2）.可以把基本数据类型的数据转换成字符串类型（调用toString方法得到字符串结果）用处不大 可以用 23 + "" 来实现转字符串
        （3）.可以把字符串类型的数据转换成真实的数据类型
 */
public class createInteger {
    public static void main(String[] args) {
        int a = 1;
        Integer a1 = a;
        System.out.println(a);
        System.out.println(a1);

        //null = null;  报错
        Integer b = null;

        System.out.println("-----------");
        Integer i = 23;
        String s = i.toString();        //将基本数据类型转化成字符串形式
        System.out.println(s + 1);

        System.out.println("-----------");
        String s1 = "123";
        //int age = Integer.parseInt(s1);     //将字符串类型的数据转换成真实的数据类型
        int age = Integer.valueOf(s1);
        System.out.println(age + 1);

        String d = "123.123";
        //double d1 = Double.parseDouble(d);
        double d1 = Double.valueOf(d);
        System.out.println(d1 + 1);
    }
}
