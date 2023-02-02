package com.hao.d5_Tread_communication;


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

    public synchronized void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        try {
            if(this.money >= money){
                //钱够取钱
                this.money -= money;
                System.out.println(name + "来取钱" + money + "成功！余额是" + this.money);
                this.notifyAll();
                this.wait();
            }else{
                /**钱不够，唤醒别人，等待自己*/
                /**唤醒所有线程*/
                this.notifyAll();
                /**锁对象，让当前线程进入等待*/
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void deposit(double money) {
        String name = Thread.currentThread().getName();
        try {
            if (this.money == 0){
                //没钱存钱
                this.money += money;
                System.out.println(name + "来存钱" + money + "成功！余额是" + this.money);
                /**有钱时应该唤醒他人，等待自己*/
                this.notifyAll();
                this.wait();
            }else{
                this.notifyAll();
                this.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
