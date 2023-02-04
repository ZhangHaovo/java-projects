package com.hao.d4_Thread_synchronized.d1_code;

public class DrawTread extends Thread{
    private Account account;
    public DrawTread(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.drawMoney(100000);
    }
}
