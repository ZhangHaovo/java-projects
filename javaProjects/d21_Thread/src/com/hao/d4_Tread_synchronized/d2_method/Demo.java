package com.hao.d4_Tread_synchronized.d2_method;
/**线程同步方式二：同步方法：把出现线程安全问题的核心方法上锁，添加synchronized修饰方法*/
public class Demo {
    public static void main(String[] args) {
            //1.定义线程类，创建一个共享账户对象
            Account account = new Account("ICBC",100000);

            //2.创建俩个线程对象，代表俩人同时进来
            new DrawTread(account,"小明").start();
            new DrawTread(account,"小红").start();
    }
}
