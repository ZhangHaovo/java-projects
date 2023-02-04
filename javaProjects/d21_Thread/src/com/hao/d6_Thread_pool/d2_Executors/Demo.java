package com.hao.d6_Thread_pool.d2_Executors;
/**使用Executors创建线程池
 *      Executors使用可能存在的陷阱，可能会出现系统风险。
 *              允许请求的任务队列长度是Integer.MAX_VALUE，可能出现OOM错误（ java.lang.OutOfMemoryError ）
 *              创建的线程数量最大上限是Integer.MAX_VALUE，线程数可能会随着任务1:1增长，也可能出现OOM错误（ java.lang.OutOfMemoryError ）*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**Executors得到线程池对象的常用方法
 * Executors：线程池的工具类通过调用方法返回不同类型的线程池对象。
 * public static ExecutorService newCachedThreadPool() 线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了一段时间则会被回收掉。
 * public static ExecutorService newFixedThreadPool (int nThreads) 创建固定线程数量的线程池，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它。
 * public static ExecutorService newSingleThreadExecutor () 创建只有一个线程的线程池对象，如果该线程出现异常而结束，那么线程池会补充一个新线程。
 * public static ScheduledExecutorService newScheduledThreadPool (int corePoolSize) 创建一个线程池，可以实现在给定的延迟后运行任务，或者定期执行任务。 */
public class Demo {
    public static void main(String[] args) {
        /**创建固定线程数据的线程池*/
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());

        /**线程被用完*/
        pool.execute(new MyRunnable());
    }
}
