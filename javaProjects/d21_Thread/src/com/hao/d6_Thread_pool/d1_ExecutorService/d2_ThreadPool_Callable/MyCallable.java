package com.hao.d6_Thread_pool.d1_ExecutorService.d2_ThreadPool_Callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
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
        return Thread.currentThread().getName() + "执行了1-" + n +"的和，执行的结果是：" + sum;
    }
}
