package com.hao.d2_exception.d3_exception_handle;

public class d5_Exception_handle_runtime {
    public static void main(String[] args) {
        /**
         * 目标：运行时异常的处理机制
         * 可以不处理，编译阶段不报错
         * 按照理论规则。建议还是处理，只需要再最外层捕获处理即可
         */
        System.out.println("程序开始");
        try {
            divide(10,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");
    }

    private static void divide(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int c = a/b;
        System.out.println(c);
    }
}
