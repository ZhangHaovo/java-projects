package com.hao.d2_exception.d3_exception_handle;

public class d1_Exception_default {
    public static void main(String[] args) {
        /*异常的默认处理流程：
                1.默认会出现在异常的代码那里自动创建一个异常对象：ArithmeticException
                2.异常会从方法中出现的点抛出给调用者，调用者最终抛出给虚拟机
                3，虚拟机接收到异常对象后，先在控制台直接输出异常栈信息数据
                4，直接在当前执行的异常点终止程序，后续代码无法执行
         */


    }
}
