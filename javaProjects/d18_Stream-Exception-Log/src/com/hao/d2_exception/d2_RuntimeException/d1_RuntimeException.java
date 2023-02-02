package com.hao.d2_exception.d2_RuntimeException;

public class d1_RuntimeException {
    public static void main(String[] args) {
        //运行时异常示例(一般是程序员没有考虑好或者是逻辑不严谨引起的程序错误)
        System.out.println("程序开始");

/**        数组索引越界异常：ArrayIndexOutOfBoundException   */
        int[] arr = {1,2,3};
        System.out.println(arr[2]);
//        System.out.println(arr[3]);       //运行出错，程序终止

/**        空指针异常：NullPointerException(直接输出没有问题，但是调用空指针的变量的功能就会报错)       */
        String name = null;
        System.out.println(name);       //null
//        System.out.println(name.length());       //运行出错，程序终止

/**        数字操作异常：ArithmeticException       */
        Object o = 23;
//        String s = (String) o;       //运行出错，程序终止

/**       类型转换异常：ClassCastException     */
//        int a = 10/0;       //运行出错，程序终止

/**        数字转换异常：NumberFormatException     */
        String number = "23fjh";
//        Integer it  = Integer.valueOf(number);        //运行出错，程序终止
//        System.out.println(it + 1);

        System.out.println("程序结束");
    }
}
