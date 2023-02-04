package com.hao.d7_Timer;

import java.util.Timer;
import java.util.TimerTask;

/**定时器:定时器是一种控制任务延时调用，或者周期调用的技术,本身就是一个单线程。
 *      作用：闹钟、定时邮件发送。
 *      特点和存在的问题:1、Timer是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入。
 *                    2、可能因为其中的某个任务的异常使Timer线程死掉，从而影响后续任务执行。
 */
public class d1_timer {
    public static void main(String[] args) {
        /**创建Timer定时器*/
        Timer timer = new Timer();

        /**调试方法。处理定时任务
         * public void schedule(TimerTask task, long delay, long period) 开启一个定时器，按照计划处理TimerTask任务*/
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行一次");
            }
        }, 3000,2000);      //延迟3s,周期2s




    }
}
