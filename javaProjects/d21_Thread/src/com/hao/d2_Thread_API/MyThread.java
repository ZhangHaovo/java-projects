package com.hao.d2_Thread_API;

public class MyThread extends Thread{

    public MyThread() {
    }

    /**构造有参构造器设置线程名*/
    public MyThread(String name){
        super(name);        //利用super将线程名传送给父类：Thread
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
        }
    }
}
