package com.hao.d2_Array_Demo;

import java.util.Scanner;

public class DemoFindTheMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] array = new double[5];

        System.out.println("请输入5个数字");      //键盘输入5个数字
        int i;
        for (i=0;i<array.length;i++) {
            array[i] = sc.nextDouble();
        }

        double Max = array[0];      //找到最大值
        for (i=1;i<array.length;i++) {
            if(array[i]>Max)
                Max = array[i];
        }

        System.out.println("这5个数字里面最大的是"+Max);

    }
}
