package com.hao.d4_Demo_ShopCar;

import java.util.Objects;
import java.util.Scanner;

//模拟购物车模块的功能。需要添加商品到购物车里面去
//同时提供添加商品，查看商品，修改购买数量，结算价格功能
public class Main {
    public static void main(String[] args) {
        //定义商品类
        //定义购物车对象

        Scanner sc = new Scanner(System.in);

        int i,temp = 0;                     //temp为购物车最后一件商品后一位的位序
        Goods[] goods = new Goods[100];     //创建商品数组
        Goods[] shopcar = new Goods[100];     //创建购物车数组
        for (i = 0; i < 100; i++) {
            goods[i] = new Goods();
            shopcar[i] = new Goods();
        }

        goods[0] = new Goods();
        goods[0].name = "富士山苹果";
        goods[0].id = 1;
        goods[0].price = 9.9;

        goods[1].id = 2;
        goods[1].name = "香蕉";
        goods[1].price = 4.9;

        goods[3].id = 3;
        goods[2].name = "菠萝";
        goods[2].price = 14.9;

        goods[3].id = 4;
        goods[3].name = "水蜜桃";
        goods[3].price = 7.9;

        goods[4].id = 5;
        goods[4].name = "西瓜";
        goods[4].price = 14.5;

        System.out.println("---------------好又多水果超市开业咯---------------");
        System.out.println("---------------今日水果商品如下---------------");
        for (i = 0; i < 5; i++) {
            System.out.println(goods[i].id + " " +goods[i].name + "价格是￥" + goods[i].price);
        }

        System.out.println("1.添加商品 2.查看购物车中的商品 3.修改商品的购买数量 4.结算价格 5.查看购物车");
        int type;
        while (true) {
            System.out.println("请输入你想要做的操作代号,输入0时推出系统");
            type = sc.nextInt();
            switch (type) {
                case 0 -> {
                    return;
                }
                case 1 ->
                    temp = add(temp, shopcar, goods);
                case 2 ->
                    search(shopcar);
                case 3 ->
                    changenum(shopcar);
                case 4 -> {
                    double sum;
                    sum = sum(shopcar);
                    System.out.println(sum);
                }
                case 5 -> {
                    System.out.println("你的购物车有" + temp + "件商品");
                    for (i = 0; i < temp; i++) {
                        System.out.println("第" + (i + 1) + "个商品：");
                        System.out.println("商品id：" + shopcar[i].id);
                        System.out.println("商品名称：" + shopcar[i].name);
                        System.out.println("你想要买" + shopcar[i].num + "个");
                        System.out.println("商品单价为" + shopcar[i].price + "商品的总价为：" + shopcar[i].price * shopcar[i].num);
                    }
                }
            }
        }
    }

    public static int add(int temp,Goods[] shopcar,Goods[] goods){      //添加商品函数
        Scanner sc = new Scanner(System.in);

        System.out.println("输入你想添加商品名称");
        String name = sc.next();
        System.out.println("输入你想买几个");
        int num = sc.nextInt();

        for (int i = 0; i < 100; i++)           //遍历商品数组，找到与输入商品名一致商品的位序，并将其信息复制到购物车中
            if(Objects.equals(goods[i].name, name)){
                shopcar[temp] = goods[i];
                shopcar[temp].num = num;
                System.out.println("添加成功");
            }
        temp++;         //temp为购物车最后一件商品后一位的位序，每添加一个商品后移一位
        return temp;
    }

    public static void search(Goods[] shopcar){     //查看指定商品信息
        Scanner sc = new Scanner(System.in);

        System.out.println("输入你想查看商品的名称");
        String name = sc.next();

        for (int i = 0; i < 100; i++)               //遍历商品数组，找到与输入商品名一致商品的位序，并将其信息打印出来
            if(Objects.equals(shopcar[i].name, name)){
                System.out.println("名称为" + name +"的商品信息如下");
                System.out.println("商品id：" + shopcar[i].id);
                System.out.println("商品名称：" + shopcar[i].name);
                System.out.println("商品单价为" + shopcar[i].price);
                System.out.println("你想要买" + shopcar[i].num + "个");
            }
    }

    public static void changenum(Goods[] shopcar){      //修改指定商品的购买个数
        Scanner sc = new Scanner(System.in);

        System.out.println("输入你想修改个数的商品名称");
        String name = sc.next();
        System.out.println("你现在想买几个？");
        int num = sc.nextInt();

        for (int i = 0; i < 100; i++)               //遍历商品数组，找到与输入商品名一致商品的位序，并将其购买的个数修改
            if(Objects.equals(shopcar[i].name, name)){
                shopcar[i].num = num;
                System.out.println("修改成功");
            }
    }

    public static double sum(Goods[] shopcar){
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        System.out.println("请输入你想要结算商品的名称,输入ok结束");

        while (true){
            String temp = sc.next();
            if(Objects.equals(temp, "ok")){
                return sum;
            }
            else{
                for (int i = 0; i < 100; i++)               //遍历商品数组，找到与输入商品名一致商品的位序，并将其购买的个数修改
                    if(Objects.equals(shopcar[i].name,temp)){
                        sum += shopcar[i].price * shopcar[i].num;
                    }
            }
        }

    }
}
