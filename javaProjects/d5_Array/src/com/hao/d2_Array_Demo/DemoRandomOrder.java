package com.hao.d2_Array_Demo;

import java.util.Random;
import java.util.Scanner;

//输入5个员工的工号后随即排名这5个工号作为出场顺序
public class DemoRandomOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int ex,temp,i;

        int[] numbers = new int[5];     //输入5个工号
        System.out.println("请输入5个工号");
        for (i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("5个工号分别为：");
        for (i = 0; i < numbers.length; i++) {      //打印输入的5个工号
            System.out.println(numbers[i]);
        }

        for (i = 0; i < numbers.length; i++) {      //随机生成索引，将工号与索引交换
            ex = r.nextInt(5);
            temp = numbers[i];
            numbers[i] = numbers[ex];
            numbers[ex] = temp;
        }

        System.out.println("随即出场的工号为：");
        for (i = 0; i < numbers.length; i++) {      //打印随机出场的工号
            System.out.println(numbers[i]);
        }
    }
}
