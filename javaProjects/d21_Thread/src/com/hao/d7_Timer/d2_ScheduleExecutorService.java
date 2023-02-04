package com.hao.d7_Timer;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**ScheduledExecutorService内部为线程池,解决了timer的问题
 *      优点：基于线程池，某个任务的执行情况不会影响其他定时任务的执行。*/
public class d2_ScheduleExecutorService {
    public static void main(String[] args) {
        /**ScheduleExecutorService线程池，作为定时器*/
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        /**开启定时任务*/
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出：AAA");
            }
        },0 ,2, TimeUnit.SECONDS);
    }
}
