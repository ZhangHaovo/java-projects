package com.hao.ProjectSalary;
/**
 * 输入俩个月的总钱，分配出来个俩个月的工资使得税最少
 */

import java.util.Scanner;

public class New1 {
    public static void main(String[] args) {

        int sum;
        boolean flag = false;

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入总钱：");
            sum = sc.nextInt();

            for (int i = 4999; i > 4980; i--) {
                int j = sum - i;        //i为第一个月，j为第二个月
                int before = (int)Math.round((j - 150) / 0.97);       //第二个月税前应做
                if(Exact(i) && Exact(j)){
                    System.out.println("第一个月应做：" + i +"元，第二个月应做：" + j + "元。第二个月税前应做：" + before + "元，税为：" + (before-5000)*0.03 + "元，约为" + Math.round((before-5000)*0.03));
                    System.out.println("第一个月：");
                    DayAndSalary(i);
                    System.out.println("第二个月：");
                    DayAndSalary(j);
                    System.out.println("\n");
                }
            }
        }
    }

    public static boolean Exact(int num){       //数值是否能被整除
        boolean flag = false;

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 400; j++) {
                if (i * j == num) {
                    flag = true;
                    return flag;
                }
            }
        }
        return flag;
    }

    public static  void DayAndSalary(int num) {
        for (int m = 0; m < 30; m++) {
            for (int n = 0; n < 400; n++) {
                if (m * n == num) {
                    System.out.println("日工资为：" + n + "元，工时为：" + m);
                }
            }
        }
    }
}
