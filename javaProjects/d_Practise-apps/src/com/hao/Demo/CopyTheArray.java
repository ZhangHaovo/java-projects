package com.hao.Demo;

import java.util.Scanner;

//将一个数组元素复制到另一个数组中去
public class CopyTheArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        int[] Original = new int[5];
        int[] Final = new int[5];

        System.out.println("输入5个数字");
        for (i = 0 ; i < 5; i++) {
            Original[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++){
            Final[i] = Original[i];
        }

        for(i = 0; i < 5; i++){
            System.out.println(Final[i]);
        }

    }
}
