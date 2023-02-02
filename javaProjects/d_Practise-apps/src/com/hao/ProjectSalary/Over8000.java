package com.hao.ProjectSalary;

import java.util.Scanner;

public class Over8000 {
    public static void main(String[] args) {

        int after = 0;
        double tax = 0.0;
        int before = 0;
        boolean flag1 = false;

        Scanner sc = new Scanner( System .in);
        while(true){
            System.out.println("输入税后总额");
            after = sc.nextInt();
            before = (int)((after + 90 - 8000*tax) / (1 - tax));

            for (int m = 0; m < 15; m++) {
                before = before - m;

                for (int i = 0; i < 30; i++) {
                    for (int j = 0; j < 400; j++) {
                        if (i * j == before) {
                            flag1 = true;
                            System.out.println("税前：" + before + "元");
                            System.out.println("税：" + ((before-8000)*tax+90) + "元，约为" + Math.round(((before-8000)*tax+90)));
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
        }
    }
}
