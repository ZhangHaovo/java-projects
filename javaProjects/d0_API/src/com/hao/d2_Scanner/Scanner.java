package com.hao.d2_Scanner;
//实现键盘录入功能

public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);       //写一行代码代表得到键盘扫描器对象（sc）

        System.out.println("请输入你的年龄");
        int a = sc.nextInt();       //等待用户输入年龄
        System.out.println("你的年龄是:" + a);

        System.out.println("请输入你的姓名");
        String name = sc.next();        //等待用户输入姓名
        System.out.println("你的姓名是" + name);
    }
}
