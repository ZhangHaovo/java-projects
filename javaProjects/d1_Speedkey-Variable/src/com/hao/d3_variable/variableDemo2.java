package com.hao.d3_variable;

public class variableDemo2 {
    public static void main(String[] args) {

        //整型 type类型 1个字节 -128~127; short短整型 占2个字节； int整型 占4个字节；long长整型 占8个字节
        //注意：随便写一个 整数字面量默认是int类型!!要想是long型需要在字面量后面加上L/l
        byte number = 98;
        System.out.println(number);         //byte number1 = 128; 报错

        long number3=1452342432L;
        System.out.println(number3);

        //浮点型 float单精度 占4个字节； double双精度 占8个字节
        //随便写一个 小数默认是double类型的！！希望小数字面量是float类型的，就要在后面加上F/f
        float score=98.5F;
        System.out.println(score);

        //布尔类型 boolean
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);
    }
}
