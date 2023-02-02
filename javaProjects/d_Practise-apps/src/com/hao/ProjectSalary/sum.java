package com.hao.ProjectSalary;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("输入总钱");
            int total = sc.nextInt();
            for (int i = 0; i < 31; i++) {
                for (int j = 0; j < 400; j++) {
                    if (i * j == total) {
                        System.out.println(i + "," + j);
                    }
                }
            }
        }
    }
}
