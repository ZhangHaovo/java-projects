package com.hao.d5_Tread_communication;

public class DepositThread extends Thread{
    private Account account;

    public DepositThread(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {      //不断地存钱
            account.deposit(100000);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
