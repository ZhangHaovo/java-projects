package com.hao.d2_Type;

public class typeDemo1 {
    public static void main(String[] args) {
        //自动类型转换

        // 1.类型范围小的变量可以直接赋值给类型范围大的变量 byte-->short-->char/(-->)int-->long-->float-->double
        //byte short char 在表达式中都是用int来运算的
        byte a =12;
        int b=a;
        System.out.println(a);
        System.out.println(b);

        char ch = 'a';
        int c=ch;
        System.out.println(c);
    }
}
