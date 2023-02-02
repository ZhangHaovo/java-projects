package com.hao.d1_System;

import java.util.Arrays;

//System:System功能是通用的，都是直接用类名调用即可，所以System不能被实例化
public class Test {
    public static void main(String[] args) {
        System.out.println("程序开始");

        /**public static long currentTimeMillis()        返回当前系统的时间毫秒值形式，指的是从1970年1月1日 00：00：00走到此刻的总的毫秒数*/
        long time = System.currentTimeMillis();
        System.out.println(time);

        /**public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝数组)      拷贝数组*/
        int arr1[] = {10,20,30,40,50,60,70};
        int arr2[] = new int[6];
        System.arraycopy(arr1,3,arr2,1,2);
        System.out.println(Arrays.toString(arr2));

        /**public static void exit(int status)       表示终止当前运行的java虚拟机，非零表示异常终止*/
        System.exit(0);         //JVM终止！

        System.out.println("程序结束");
    }
}
