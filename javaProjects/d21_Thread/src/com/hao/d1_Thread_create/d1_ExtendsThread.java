package com.hao.d1_Thread_create;
/**thread:线程是一个程序内部的一条执行路径
 *      单线程：若程序中只有一条执行路径，那么程序就是单线程的程序
 *      多线程：指从软硬件上实现多条执行流程的技术*/

/**3.多线程的创建：继承Thread类
 *      优点：编码简单
 *      缺点：线程类已经继承Thread，无法继承其他类，不利于扩展
 *      注意：①不要用run方法，会当成普通方法，此时还是单线程执行
 *           ②不能将主线程任务放在子线程之前，这样主线程跑完才会到子线程，相当于单线程*/
public class d1_ExtendsThread {
    public static void main(String[] args) {
        /**3.new一个新线程对象*/
        Thread t = new MyThread();

        /**4.调用start方法启动线程（执行的还是run方法）*/
        t.start();      //若直接用run方法，会直接当成普通方法执行，此时相当于还是单线程执行

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出：" + i);
        }
    }
}



/**1.定义一个线程继承Thread类*/
class MyThread extends Thread{
    /**2.重写run方法，里面是定义线程以后要干什么*/
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出：" + i);
        }
    }
}
