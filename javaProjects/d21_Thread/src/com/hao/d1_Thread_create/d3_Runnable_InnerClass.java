package com.hao.d1_Thread_create;
/**多线程的创建：实现Runnable接口（匿名内部类形式）*/
public class d3_Runnable_InnerClass {
    public static void main(String[] args) {
        /**创建一个任务对象
         * 优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强
         * 缺点：结果是不可以直接返回的*/
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程1执行输出" + i);
                }
            }
        };
        /**把任务对象交给Thread处理*/
        Thread t = new Thread(target);
        /**启动线程*/
        t.start();


        /**简化*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2执行输出" + i);
                }
            }
        }).start();

        /**简化*/
        new Thread(() ->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程3执行输出" + i);
                }
        }).start();

        /**主线程任务*/
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行输出" + i);
        }
    }
}
