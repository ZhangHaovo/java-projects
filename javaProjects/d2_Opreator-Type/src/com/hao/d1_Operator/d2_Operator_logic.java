package com.hao.d1_Operator;

public class d2_Operator_logic {
    public static void main(String[] args) {
        //逻辑运算符

        // & 且 俩个都是真才是真
        double a=1.0;
        double b=2.0;
        System.out.println(a>0.9 & b>1.9);

        // | 或 只要是一个真就是真
        System.out.println(a>0.9 | b<1.9);

        // ^ 异或 俩个不同为真 俩个相同为假
        System.out.println(false^false);
        System.out.println(false^true);
        System.out.println(true^true);

        // && 短路与 判断结果与&一致 当左边为false时，右边不执行
        // || 短路或 判断结果与|一致 当左边为true时，右边不执行

    }
}
