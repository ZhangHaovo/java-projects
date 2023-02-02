package com.hao.d1_Method_use;

public class d1_CreateMethod {
    public static void main(String[] args) {
        int num1 = 1,num2 = 2;
        int sum1 = sum(num1,num2);
        System.out.println(sum1);

        int sum2 = sum(2,5);
        System.out.println(sum2);
    }

    public static int sum(int a, int b){
        int c =a + b;
        return c;
    }
}
