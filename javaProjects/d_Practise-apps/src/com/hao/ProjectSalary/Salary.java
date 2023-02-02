package com.hao.ProjectSalary;

import java.util.Random;
import java.util.Scanner;

//210*11+200*22+180*14=4200+2620+2520=9340
public class Salary {
        public static void main(String[] args) {

            Random r = new Random();
            Scanner sc = new Scanner(System.in);

            System.out.println("这个月多少天?");
            int day = sc.nextInt();
            System.out.println("有多少工人?");
            int num = sc.nextInt();
            System.out.println("总共多少钱?");
            int total = sc.nextInt();
            System.out.println("希望每个工人工资最高不超过多少？");
            int maxsalary = sc.nextInt();
            System.out.println("希望每个工人出勤天数最少不低于多少？");
            int maxday = sc.nextInt();

            int sum = 0,i =0;
            int daysalary[] = new int[num];
            int workday[] = new int[num];
            int personsalary[] =new int[num];

            System.out.println("输入工人的日工资");
            for (i = 0; i < num; i++) {
                System.out.println("第" + (i+1) +"个工人的日工资是");
                daysalary[i] = sc.nextInt();
            }

            while (sum != total || judge(daysalary,workday,num,maxsalary,maxday)){
                sum =0;
                for (i = 0; i < num; i++) {
                    workday[i] = r.nextInt(1,day+1);
                    personsalary[i] = daysalary[i] * workday[i];
                    sum+= personsalary[i];
                }
            }
            for (i = 0; i < num; i++) {
                System.out.println(workday[i]);
            }
        }

        public static Boolean judge(int[] daysalary,int[] workday,int num,int maxsalary,int maxday){
            for (int j = 0; j < num; j++) {
                if(daysalary[j] * workday[j] >maxsalary || workday[j] < maxday){
                    return(true);
                }
            }
            return (false);
        }
}
