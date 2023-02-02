package com.hao.d4_Tread_synchronized.d3_Lock;

//取钱的线程类
public class DrawTread extends Thread {
    //接受处理的账户对象
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
