package com.hao.d2_Array_Demo;

import java.util.Random;
import java.util.Scanner;

//从1-20中随机生成5个数字，猜中显示
public class DemoGuessTheNumbers {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int i,j,k;                      //随机生成5个数字存放在数组内
        int[] lucknumbers = new int[5];
        for (k=0;k<5;k++) {
            lucknumbers[k] = r.nextInt(19) + 1;
        }

        int guess;
        System.out.println("请在1-20猜一个奖");
        String[] temp = {"*","*","*","*","*",};     //暂存奖品号码
        for (k=0;k<5;k++) {
            System.out.println(temp[k]);
        }

        while(true) {
            System.out.println("请输入你想猜的数字");
            guess = sc.nextInt();

            for (i = 0; i < 5; i++) {
                if (guess == lucknumbers[i]) {
                    System.out.println("恭喜你猜中了第"+(i+1)+"个奖");
                    temp[i] = (guess+"");
                    lucknumbers[i] = 0;     //防止重复幸运数字
                    System.out.println("现存幸运数字:");
                    for (j=0;j<5;j++)
                        System.out.println(temp[j]);
                break;
                }
                if(i==4) {       //遍历完还没有找到幸运数字说明没猜中
                    System.out.println("你没猜中");
                }
            }
            for (j=0;j<5;j++) {     //暂存数组中还有*说明没猜完
                if (temp[j]=="*") {
                    System.out.println("猜奖将继续");
                    break;
                }
            }
            if(j==5){
                System.out.println("奖没了捏");
                break;
            }
        }
    }
}
