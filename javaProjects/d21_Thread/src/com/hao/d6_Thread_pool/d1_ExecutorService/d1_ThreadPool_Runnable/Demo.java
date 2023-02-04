package com.hao.d6_Thread_pool.d1_ExecutorService.d1_ThreadPool_Runnable;
/**线程池：一个可以复用线程的技术
 *      不使用线程的问题：用户发送一个请求，后台就窗就创建一个新线程来处理，这样会严重影响系统的性能
 *      代表线程池的接口：ExecutorService
 *      获得线程池对象：①使用ExecutorService的实现类ThreadPoolExecutor自创建一个线程对象
 *                   ②使用Executors(线程池的工具类)调用方法返回不同特点的线程池对象
 *      临时线程创建时间：新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程
 *      拒绝任务时间：核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始任务拒绝。*/

import java.util.concurrent.*;

/**创建线程池
 * public ThreadPoolExecutor(int corePoolSize,      参数一：指定线程池的线程数量（核心线程）： corePoolSize 不能小于0
 * int maximumPoolSize,     参数二：指定线程池可支持的最大线程数： maximumPoolSize     最大数量 >= 核心线程数量
 * long keepAliveTime,      参数三：指定临时线程的最大存活时间： keepAliveTime 不能小于0
 * TimeUnit unit,           参数四：指定存活时间的单位(秒、分、时、天)： unit 时间单位
 * BlockingQueue<Runnable> workQueue,       参数五：指定任务队列： workQueue 不能为null
 * ThreadFactory threadFactory,             参数六：指定用哪个线程工厂创建线程： threadFactory 不能为null
 * RejectedExecutionHandler handler)        参数七：指定线程忙，任务满的时候，新任务来了怎么办： handler 不能为null
 * */

/**
 * 拒绝策略：
 * ThreadPoolExecutor.AbortPolicy：丢弃任务并抛出RejectedExecutionException异常。是默认的策略
 *ThreadPoolExecutor.DiscardPolicy： 丢弃任务，但是不抛出异常 这是不推荐的做法
 *ThreadPoolExecutor.DiscardOldestPolicy：抛弃队列中等待最久的任务 然后把当前任务加入队列中
 *ThreadPoolExecutor.CallerRunsPolicy：由主线程负责调用任务的run()方法从而绕过线程池直接执行
 * */
public class Demo {
    public static void main(String[] args) {
        /**线程池处理Runnable任务*/

        /**创建线程池对象*/
        ExecutorService pool = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        /**给任务线程池处理 execute(Runnable 任务对象);*/
        Runnable target = new MyRunnable();

        /**3个任务被3个线程处理*/
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        /**5个任务在队列，不创建线程*/
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        /**当队列满后，开始创建新的临时线程*/
        pool.execute(target);
        pool.execute(target);

        /**总线程满后，将会拒绝新的任务*/
        pool.execute(target);

        /**关闭线程池（一般不会使用），立即关闭，即使任务没有完成，任务丢失*/
//        pool.shutdownNow();



    }
}
