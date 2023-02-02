package com.hao.d3_Random;

import java.util.Random;

//实现生成一个随机数的功能
public class random {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(10);     //随机生成0-9之间的随机数（不包后）
        System.out.println(number);

        //生成区间随机数
        //用减加法生成3-6之间的随机数
        int a = r.nextInt(4)+3;    //（3-6）-->(0-3)+1 bound值为4
        System.out.println(a);
        //直接调用前后边界值生成3-6的随机数
//        int b = r.nextInt(3,7);      //包前不包后 范围为3-6
//        System.out.println(b);
    }
}
