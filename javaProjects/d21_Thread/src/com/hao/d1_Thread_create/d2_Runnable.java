package com.hao.d1_Thread_create;
/**多线程的创建：实现Runnable接口
 *      优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强
 *      缺点：编程多一层对象包装，如果线程有执行结果是不可以直接返回的*/
public class d2_Runnable {
    public static void main(String[] args) {
        /**3.创建一个任务对象*/
        Runnable target = new MyRunnable();

        /**4.把任务对象交给Thread处理*/
        Thread t = new Thread(target,"1号");         /**此构造器可以改线程名*/

        /**5.启动线程*/
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出" + i);
        }
    }
}

/**1.定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法*/
class MyRunnable implements Runnable{
    /**2.重写run方法，定义线程的执行任务的*/
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行输出" + i);
        }
    }
}
