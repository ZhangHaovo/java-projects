package com.hao.d4_Math;
//Math:包含基本数字运算的方法，Math类没有提供公开的构造器，通过类名就可以直接调用
public class Test {
    public static void main(String[] args) {

        //public static int abs(int a)      获取参数绝对值
        System.out.println(Math.abs(-1));

        //public static double ceil(double a)       向上取整
        System.out.println(Math.ceil(4.11111));

        //public static double floor(double a)      向下取整
        System.out.println(Math.floor(5.9999));

        //public static int round(float a)      四舍五入
        System.out.println(Math.round(4.5));

        //public static int max(int a ,int b)       获取俩个int值的最大值
        System.out.println(Math.max(1.4,1.39));

        //public static double pow(double a,double b)       返回a的b次幂
        System.out.println(Math.pow(1,2));

        //public static double random()     返回值为double的随机值，范围[0.0 , 1.0]
        System.out.println(Math.random());
    }
}
