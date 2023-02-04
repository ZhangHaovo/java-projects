package com.hao.d4_Thread_synchronized.d1_code;

public class Account {
    private String cardID;
    private double money;

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    public static void run(){
        synchronized (Account.class){           //对于静态方法建议使用字节码

        }
    }

    public void drawMoney(double money){
        String name = Thread.currentThread().getName();


        /**同步代码块,锁对象需要满足对于俩个线程是唯一的，对于示例方法建议使用共享资源作为锁对象*/
        synchronized (this) {       //this == account,为当前账户
            if (this.money >= money){       //判断账户钱是否够
                System.out.println(name + "来取钱成功，吐出" + money + "元");
                this.money -= money;        //更新余额
                System.out.println(name + "取钱后剩余" + this.money);
            }else{
                System.out.println(name + "来取钱余额不足");
            }
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
