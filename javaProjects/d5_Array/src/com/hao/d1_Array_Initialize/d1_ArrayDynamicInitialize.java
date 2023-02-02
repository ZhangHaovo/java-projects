package com.hao.d1_Array_Initialize;

import java.util.Scanner;

public class d1_ArrayDynamicInitialize {
    public static void main(String[] args) {
        int[] array = new int[4];       //定义数组个数但不赋值

        Scanner sc = new Scanner(System.in);

        int i;
        for (i=0;i<4;i++) {             //动态赋值
            System.out.println("请你输入第" + (i+1) + "个数");
            array[i] = sc.nextInt();
        }

        for (i=0;i<4;i++) {
            System.out.println(array[i]);
        }
    }
}
