package com.hao.d6_Thread_pool.d1_ExecutorService.d2_ThreadPool_Callable;

import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) throws Exception{
        /**线程池处理Callable任务*/

        /**创建线程池对象*/
        ExecutorService pool = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        /**给任务线程池处理
         * Future<T> submit(Callable<T> task) 执行Callable任务，返回未来任务对象获取线程结果*/
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

    }
}
