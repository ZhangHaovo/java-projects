package com.hao.d2_Methon_recursion;

public class d2_recursion_Demo {
    public static void main(String[] args) {
        //猴子第一天摘下若干桃子，当即吃了一半,觉得好不过瘾,于是又多吃了一个 第二天又吃了前天剩余桃子数量的一半,觉得好不过瘾，于是又多吃了一个以后每天都是吃前天剩余桃子数量的一半,觉得好不过瘾,又多吃了一个等到第10天的时候发现桃子只有1个了。
        //需求:请问猴子第一天摘了多少个桃子?


        //f(x)表示第x天的桃子树，f(x+1)表示第x+1天的桃子树
        //f(x) - f(x)/2 - 1 = f(x+1)
        //2f(x) - f(x) -2 = 2f(x+1)
        //f(x) = 2f(x+1) + 2
        //递归的总结点：f(10) = 1
        System.out.println(f(1));
    }
    public static int f(int n){
        if (n == 10){
            return 1;
        }else {
            return 2 * f(n + 1) + 2;
        }
    }
}
