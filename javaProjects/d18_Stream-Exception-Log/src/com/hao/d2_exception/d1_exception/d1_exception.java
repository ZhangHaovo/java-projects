package com.hao.d2_exception.d1_exception;

public class d1_exception {
    public static void main(String[] args) {
        //异常是程序再编译执行时候可能会出现的问题，注意：不包括语法错误，例如：数组越界，空指针异常，日期格式化问题等
        //如果异常不提前处理，程序就会退出JVM虚拟机而终止

        /*异常体系：
            Throwable:
                1.Error（难以干预）:系统级别的问题、JVM退出等、代码无法控制
                2.Exception（能够干预）：java.lang包下，被称为异常类，它代表程序本身可以处理的问题
                    （1）RuntimeException及其子类：运行时异常，编译阶段并不会报错（空指针异常，数组索引越界异常）
                    （2）除RuntimeException之外所有的异常：编译时异常，编译期必须要处理的，否则程序不能通过编译（日期格式化异常）
         */

        int[] arr = {10,20,40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println("----------程序截至----------");         //由于数组越界，此行代码将不被执行
    }
}
