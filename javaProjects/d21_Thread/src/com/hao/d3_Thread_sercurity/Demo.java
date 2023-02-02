package com.hao.d3_Thread_sercurity;
/**线程安全问题：多个线程同时操作同一个共享资源的时候可能会出现业务安全问题，称为线程安全问题*/
public class Demo {
    //案例：共享账户有100000，俩人同时取100000
    public static void main(String[] args) {
        //1.定义线程类，创建一个共享账户对象
        Account account = new Account("ICBC",100000);

        //2.创建俩个线程对象，代表俩人同时进来
        new DrawTread(account,"小明").start();
        new DrawTread(account,"小红").start();


    }
}
