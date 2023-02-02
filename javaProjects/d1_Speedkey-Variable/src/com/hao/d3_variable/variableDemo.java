package com.hao.d3_variable;

public class variableDemo {
    public static void main(String[] args) {

        double money = 6.0;
        System.out.println(money);

        //变量的有效范围是从定义开始到所属大括号体的“}”截至的
        {
            int a=2;
            System.out.println(a);
        }//end of 'a'
        /*System.out.println(a);*/                    //这里的a不在定义的范围里面，故无效

        System.out.println(money);
        int a=1;
        System.out.println(a);

    }//end of money
}
