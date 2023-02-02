package com.hao.d9_Objects;

import java.util.Objects;

//Objects类是Object的子类
public class Test {
    public static void main(String[] args) {
        /**public static boolean equals(object a ,object b)     Objects的equals方法比较的结果是一样的，但是更加安全*/
        String s1 = null;
        String s2 = "zhang";
        //由于String自动重写了equals函数，比较的为内容
        //System.out.println(s1.equals(s2));      //但是若s1值为null则会报错,留下安全隐患
        System.out.println(Objects.equals(s1, s2));

        /**public static boolean isNull(Object o)   判断变量是否为null，为null返回true */
        System.out.println(Objects.isNull(s1));
        System.out.println(s1 == null);         //完全相同
    }
}
