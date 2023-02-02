package com.hao.Demo;

import java.util.Scanner;

//找区间素数（除了1和它本身，其他数字除不尽的数字）
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start,end,sum;

        System.out.println("请输入区间起始数字");
        start = sc.nextInt();
        System.out.println("请输入区间结束数字");
        end = sc.nextInt();
        sum = FindPrime(start, end);
        System.out.println("一共有" + sum + "个素数");
    }

    public static int FindPrime(int start, int end) {
        int i, j, count = 0;
        System.out.println("素数分别为");

        for (i = start; i <= end; i++) {

            for (j = 2; j < i; j++) {
                if (i % j == 0) {       //能被其他数整除 则弹出循环考虑下一个数
                    break;
                }
            }
            if (j == i) {     //j == i 说明j遍历完了还没有被除尽 则是素数
                System.out.println(i);
                count++;
            }

        }
        return count;
    }

}

