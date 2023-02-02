package com.hao.d2_Methon_recursion;

public class d3_recursion_Demo {
    //啤酒2元一瓶，4个瓶盖可以换一瓶啤酒，俩个空瓶可以换一瓶啤酒，问：10元可以换多少瓶啤酒，还剩多少空瓶和瓶盖

    //利用静态变量记录总共的酒的数量/当前剩余的盖子数/酒瓶数量
    public static int totalNumber;
    public static int lastBottleNumber;
    public static int lastCoverNumber;

    public static void main(String[] args) {
        buy(10);
        System.out.println("总共能买的酒的数量:" + totalNumber);
        System.out.println("剩余酒盖的数量:" + lastCoverNumber);
        System.out.println("剩余酒瓶的数量:" + lastBottleNumber);
    }

    private static void buy(int money) {
        int buyNumber = money /2;
        totalNumber += buyNumber;

        //把盖子和酒瓶换算成钱
        int coverNumber = lastCoverNumber +  buyNumber;     //酒盖数量是当前买酒数量加上上一轮剩余的酒盖数量
        int bottleNumber = lastBottleNumber +  buyNumber;
        int allMoney = 0;       //本轮兑换酒的价格
        if (coverNumber >= 4){
            allMoney += (coverNumber / 4) * 2;          //若大于4个酒盖则换算成钱
        }
        lastCoverNumber = coverNumber % 4 ;     //将剩余的盖子存在本轮剩余酒盖数量

        if (bottleNumber >= 2){
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber = bottleNumber % 2 ;

        if (allMoney >= 2){
            buy(allMoney);
        }
    }
}
