package com.hao.ProjectSalary;
/**
 * 输入天数，若超过5000，求出税前日工资和天数，若不能整除，以最低的补贴求出
 *         若未超过5000，求出日工资和天数，若不能整除，以最低的补贴求出
 */

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        double after = 0.0;
        int before = 0;
        boolean flag1 = false;
        boolean flag2 = false;

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("总钱：");
            after = sc.nextDouble();

            if(after > 5000){       //需要交税
                before = (int)Math.round((after - 150) / 0.97);

                for (int m = 0; m < 15; m++) {
                    before = before - m;

                    for (int i = 0; i < 30; i++) {
                        for (int j = 0; j < 400; j++) {
                            if (i * j == before) {
                                flag1 = true;
                                System.out.println("税前：" + before + "元");
                                System.out.println("税：" + (before-5000)*0.03 + "元，约为" + Math.round((before-5000)*0.03));
                                if(m != 0){
                                    System.out.println("需要补贴" + m + "元");
                                }
                                System.out.println("工时"+ i + "天，日工资" + j + "元" + "\n");
                            }
                        }
                    }
                    if(flag1 == true){
                        break;
                    }
                }
                if (flag1 == false){
                    System.out.println("没有合适的数值");
                }
            }
            else {      //不需要交税
                for (int n = 0; n < 15; n++) {
                    after = after - n;

                    for (int p = 0; p < 30; p++) {
                        for (int q = 0; q < 400; q++) {
                            if (p * q == after) {
                                flag2 = true;
                                if(n != 0){
                                    System.out.println("需要补贴" + n + "元");
                                }
                                System.out.println("工时"+ p + "天，日工资" + q + "元" + "\n");
                            }
                        }
                    }
                    if(flag2 == true){
                        break;
                    }
                }
                if (flag2 == false){
                    System.out.println("没有合适的数值");
                }
            }

        }
    }
}
