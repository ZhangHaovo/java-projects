package com.hao.d2_Type;

public class typeDemo2 {
    public static void main(String[] args) {
        //表达式中的自动类型转换规则
        //byte short char 在运算过程中中直接当成int类型参与运算的
        byte a=10;
        byte b=20;
        int c=a+b;          //byte c=a+b; 报错
        System.out.println(c);

        //强制类型转换
        //数据类型 变量2 =（数据类型）变量1
        int d=20;
        byte e = (byte)d;
        System.out.println(e);

        //double类型转换int类型丢失小数部分
    }
}
