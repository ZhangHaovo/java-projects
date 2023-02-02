package com.hao.d4_Tread_synchronized.d3_Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
     private String cardID;
     private double money;
     /**锁对象*/
     private final Lock lock = new ReentrantLock();     //final修饰后唯一和不可替换的

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    public void drawMoney(double money){
        String name = Thread.currentThread().getName();

        /**上锁*/
        lock.lock();
        try {
            if (this.money >= money){       //判断账户钱是否够
                System.out.println(name + "来取钱成功，吐出" + money + "元");
                this.money -= money;        //更新余额
                System.out.println(name + "取钱后剩余" + this.money);
            }else{
                System.out.println(name + "来取钱余额不足");
            }
        } finally {
            /**解锁，放入finally内防止出现异常*/
            lock.unlock();
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
