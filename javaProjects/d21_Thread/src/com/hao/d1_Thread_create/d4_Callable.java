package com.hao.d1_Thread_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**多线程的创建：实现Callable接口,结合FutureTask完成
 *      优点：线程任务类只是实现接口，可以继续继承类和实现接口，扩展性强，可以在线程执行完毕后获取线程执行的结果
 *      缺点：编程复杂一些
 *      FutureTask的作用：①实现了Runnable接口，所以是Runnable对象；
 *                      ②可以在线程执行完毕之后通过get方法得到线程执行的结果*/
public class d4_Callable {
    public static void main(String[] args) {
        /**3.创建Callable任务对象*/
        Callable<String> call = new MyCallable(100);

        /**4.把Callable任务对象交给FutureTask对象*/
        FutureTask<String> f1 = new FutureTask<>(call);         //由于Thread的构造器只能接Runnable接口的对象，所以必须用FutureTask封装

        /**交给线程处理*/
        Thread t1 = new Thread(f1);

        /**启动线程*/
        t1.start();

        //子线程2
        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        Thread t2 = new Thread(f2);
        t2.start();

        /**通过FutureTask的get方法拿结果*/
        try {
            String rs1 = f1.get();      //get方法会等待子线程全部跑完才得到结果
            System.out.println("第一个结果：" + rs1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String rs2 = f2.get();
            System.out.println("第二个结果：" + rs2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**1.定义任务类 实现Callable接口（应该申明线程任务执行完毕后的结果的数据类型）*/
class MyCallable implements Callable<String>{
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    /**2.重写call，可以返回值*/
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程执行的结果是：" + sum;
    }
}
