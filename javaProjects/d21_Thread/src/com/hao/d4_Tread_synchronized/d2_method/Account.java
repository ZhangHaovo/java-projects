package com.hao.d4_Tread_synchronized.d2_method;

public class Account {
    private String cardID;
    private double money;

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

/**线程同步方式二：同步方法：添加synchronized修饰*/
    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        if (this.money >= money) {       //判断账户钱是否够
            System.out.println(name + "来取钱成功，吐出" + money + "元");
            this.money -= money;        //更新余额
            System.out.println(name + "取钱后剩余" + this.money);
        } else {
            System.out.println(name + "来取钱余额不足");
        }
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
