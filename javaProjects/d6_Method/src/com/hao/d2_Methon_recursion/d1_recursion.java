package com.hao.d2_Methon_recursion;

public class d1_recursion {
    public static void main(String[] args) {
        /**方法递归：方法直接调用自己的形式称为方法递归
         *      形式：直接递归：方法自己调用自己
         *           间接递归：方法调用其他方法，其他方法又调回方法自己
         *      要素：1.递归的公式;2.递归的终结点;3.递归的方向必须走向总结点*/

        //Demo:计算1-n的阶乘的结果：f(n)=f(n-1)*n
        System.out.println(f(9));
    }

        public static int f(int n){
        if(n ==1){
            return 1;
        }
        else{
            return f(n - 1) * n;
        }
    }
}
