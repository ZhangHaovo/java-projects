package com.hao.d2_Thread_API;

public class Demo {
    public static void main(String[] args) throws Exception{
        /**利用有参构造器设置线程名*/
        Thread t1 = new MyThread("1号");

        /**通过.setName设置线程名*/
//        t1.setName("1号");
        t1.start();
        /**通过.getName来获取线程名*/
        System.out.println(t1.getName());

        Thread t2 = new MyThread("2号");
//        t2.setName("2号");
        t2.start();
        System.out.println(t2.getName());

        /**获取当前线程*/
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出：" + i);
            if (i == 3){
                /**让线程进入休眠状态*/
                Thread.sleep(3000);     //sleep是静态方法，可以直接用Thread调用(休眠3秒)
            }
        }
    }
}
