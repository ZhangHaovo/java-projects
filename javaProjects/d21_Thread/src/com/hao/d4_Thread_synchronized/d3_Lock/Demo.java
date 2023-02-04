package com.hao.d4_Thread_synchronized.d3_Lock;
/**线程同步方式三：Lock:一种新的锁对象Lock,更加清晰地表达如何加锁如何释放锁，是接口不能直接实例化，采用他的实现类ReentrantLock来构建Lock对象*/
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
