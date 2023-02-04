package com.hao.d4_Thread_synchronized.d1_code;
/**线程同步：解决线程安全问题
    核心思想：加锁，把共享资源进行上锁，每次只能一个线程进入访问，完毕以后解锁，然后其他线程才能进来
    方式一：同步代码块
    方式二：同步方法
    方式三：Lock锁*/

/**线程同步方式一：同步代码块：把出现线程安全问题的核心代码块上锁
 *      锁对象需要满足对于俩个线程是唯一的，但是最好不要用任意唯一对象，会影响其他无关线程执行
 *      锁对象的规范要求：①对于示例方法建议使用共享资源作为锁对象
 *                     ②对于静态方法建议使用字节码（类名.class）对象作为锁对象*/
public class Demo {
    public static void main(String[] args) {
        //1.定义线程类，创建一个共享账户对象
        Account account = new Account("ICBC",100000);

        //2.创建俩个线程对象，代表俩人同时进来
        new DrawTread(account,"小明").start();
        new DrawTread(account,"小红").start();
    }
}
