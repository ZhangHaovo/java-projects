package com.hao.d2_exception.d5_exception_Demo;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //需求：需要输入一个合法的价格为止，要求价格大于0

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入合法的价格");
                String priceStr = sc.nextLine();        //不要用Double去接数据（因为输入的可能是字符，double类型无法识别）
                //将接收的数据转换成double类型
                double price = Double.valueOf(priceStr);

                if (price > 0) {
                    System.out.println("定价：" + price);
                }else{
                    System.out.println("价格必须是正数");
                }
            } catch (Exception e) {
                System.out.println("用户输入的数据有问题");
            }
        }
    }
}
