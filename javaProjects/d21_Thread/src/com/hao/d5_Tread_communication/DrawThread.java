package com.hao.d5_Tread_communication;

public class DrawThread extends Thread{
    private Account account;

    public DrawThread(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {      //不断地取钱
            account.drawMoney(100000);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
