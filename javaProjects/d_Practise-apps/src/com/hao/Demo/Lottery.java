package com.hao.Demo;

import java.util.Random;
import java.util.Scanner;

/* 投注号码由6个红球和1个蓝球组成。红球号码从1-33中选择，蓝球号码从1-16中选择
一等奖： 6 红 + 1 蓝      奖金：1000万
二等奖： 6 红 + 0 蓝      奖金：500万
三等奖： 5 红 + 1 蓝      奖金：3000
四等奖： 5 红 + 0 蓝
        4 红 + 1 蓝      奖金：200
五等奖： 4 红 + 0 蓝
        3 红 + 1 蓝      奖金：10
六等奖： 1 红 + 1 蓝
        0 红 + 1 蓝      奖金：5 */
public class Lottery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int i,j,NumberOfCorrectRed = 0,prizeblue;
        boolean NumberOfCorrectBlue;
        int[] prizered;        //红球的奖品号码
        int[] red = new int[6];             //顾客所猜的红球号码
        int blue;                           //顾客所猜的蓝球号码

        prizered = Prize();                               //调用函数生成红球奖品号码
        prizeblue = r.nextInt(1,17);        //生成蓝球奖品号码

        System.out.println("在1-33中抽取6个红球");     //抽取6个红球
        for (i = 0; i < 6; i++){
            red[i] = sc.nextInt();
        }

        System.out.println("在1-16中抽取1个蓝球");     //抽取1个蓝球
        blue = sc.nextInt();

        for (i = 0; i < 6; i++)     //计算出有多少个红球被猜中
            for(j = 0; j < 6; j++)
                if(prizered[j] == red[i])
                    NumberOfCorrectRed++;

        NumberOfCorrectBlue = blue == prizeblue;

        //中奖金额
        switch (NumberOfCorrectRed){
            case 0:
                if(NumberOfCorrectBlue)
                    System.out.println("恭喜你中了5块");
                else
                    System.out.println("你啥也没中");
                break;
            case 1:
                if(NumberOfCorrectBlue)
                    System.out.println("恭喜你中了5块");
                else
                    System.out.println("你啥也没中！");
                break;
            case 3:
                if(NumberOfCorrectBlue)
                    System.out.println("恭喜你中了10块");
                else
                    System.out.println("你啥也没中!");
                break;
            case 4:
                if(NumberOfCorrectBlue)
                    System.out.println("恭喜你中了200块");
                else
                    System.out.println("恭喜你中了10块");
                break;
            case 5:
                if(NumberOfCorrectBlue)
                    System.out.println("恭喜你中了3000块");
                else
                    System.out.println("恭喜你中了200块");
                break;
            case 6:
                if(NumberOfCorrectBlue)
                    System.out.println("恭喜你中了1000万");
                else
                    System.out.println("恭喜你中了500万");
                break;
        }
        System.out.println("红球中奖号码为：");
        for(i = 0; i < 6; i++)
            System.out.println(prizered[i]);
        System.out.println("蓝球中奖号码为：");
        System.out.println(prizeblue);
    }

    public static int[] Prize(){        //生成不重复的红球中奖号码

        Random r = new Random();

        int i,j,k,temp,bound = 33;
        int[] prizepool = new int[33];  //设置奖金池（1-33）
        int[] prize = new  int[6];

        for (i = 0; i < 33; i++) {
            prizepool[i] = i + 1;
        }

        for (j = 0; j < 6; j++) {       //随机生成6个不重复的奖号
            temp = r.nextInt(bound);  //在 1-bound（初始33） 中抽取1个号码（每次抽取后bound--）
            prize [j] = prizepool [temp];       //将抽取的号码放入奖品数组中
            for(k = temp+1; k < prizepool.length; k++){     //奖品池中删除被抽取的号码，以免重复抽取
                prizepool[k-1] = prizepool[k];
            }
            bound--;
        }
        return prize;       //返回奖品号码
        // 数组
    }
}
