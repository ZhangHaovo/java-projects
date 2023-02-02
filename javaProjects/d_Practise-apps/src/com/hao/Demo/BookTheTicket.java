package com.hao.Demo;

import java.util.Scanner;

//机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
//机票最终优惠价格的计算方案如下：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。

public class BookTheTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price;
        int mouth;
        String kind;

        System.out.println("请输入你机票的原价");
        price = sc.nextDouble();
        System.out.println("输入你机票所在的月份");
        mouth = sc.nextInt();
        System.out.println("你购买的是头等舱还是经济舱？");
        kind = sc.next();

        if(price <= 0){
            System.out.println("你输入的价格有错误");
        }
        else{
            if(mouth > 4 && mouth < 11){
               switch (kind){
                   case "头等舱":
                       price *= 0.9;
                       break;
                   case "经济舱":
                       price *= 0.85;
                       break;
               }
            }
            else{
                switch (kind){
                    case "头等舱":
                        price *= 0.7;
                        break;
                    case "经济舱":
                        price *= 0.65;
                        break;
                }
            }
        }
        System.out.println(price);

    }
}
