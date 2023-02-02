package com.hao.d1_Method_use;

import java.util.Arrays;

public class d3_Method_params {
    public static void main(String[] args) {
        /**可变参数：用于在形参中接收多个数据，传输数据非常灵活
                格式：数据类型...参数名称
                注意：1.可变参数在方法内部就是一个数组
                    2.一个形参列表中可变参数只能有一个
                    3.可变参数必须放在形参列表的最后
         */

        sum();      //不传参数
        sum(10);    //传一个
        sum(10,20,30);      //传多个
        sum(new int[]{10,20,30});   //传一个数组
    }

    public static void sum(int...nums) {
        System.out.println("元素个数" + nums.length);
        System.out.println("元素内容" + Arrays.toString(nums));
    }
}
