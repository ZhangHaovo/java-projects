package com.hao.d5_Tread_communication;
/**线程通信：线程间互相发送数据，线程通信通常通过共享一个数据的方式实现。线程会根据共享数据的情况决定自己该怎么做，以及通知其他线程怎么做。通常是在多个线程操作同一个共享资源的时候需要进行通信，且要保证线程安全
 * Object类的等待和唤醒方法(注意：这些方法应该使用当前同步锁对象进行调用)：
 *      void wait() 让当前线程等待并释放所占锁，直到另一个线程调用notify()方法或者notifyALL()方法
 *      void notify()   唤醒正在等待的单个线程
 *      void notifyAll() 唤醒正在等待的所有线程*/

//案例：三个人专门存钱(生产者)，通过一个账户，二个人专门取钱（消费者），必须满足一存一取
public class Demo {
    public static void main(String[] args) {
        //创建一个账户对象，共享资源
        Account account = new Account("ICBC-110",0);

        //创建俩个取钱线程
        new DrawThread(account,"小明").start();
        new DrawThread(account,"小红").start();

        //创建三个存钱线程
        new DepositThread(account,"一号").start();
        new DepositThread(account,"二号").start();
        new DepositThread(account,"三号").start();
    }
}
