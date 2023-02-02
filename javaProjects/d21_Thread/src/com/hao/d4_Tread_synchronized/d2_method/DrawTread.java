package com.hao.d4_Tread_synchronized.d2_method;

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
