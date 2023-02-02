package com.hao.d4_StaticUtil;
/*
1.在DemoArraysUtil中提供一个工具类方法toString,用于返回整数数组的内容，返回的字符串格式如：[10,20,30,40,50,60]
2.通常需要统计平均数，平均数为去掉最低分和最高分的平均数，请提供一个方法getAverage，用于返回平均值
 */
public class DemoArraysUtilsMain {
    public static void main(String[] args) {
        int[] arr = {10,50,50,50,50,50,50,50,50,100};
        System.out.println(DemoArraysUtils.toString(arr));
        System.out.println(DemoArraysUtils.getAverage(arr));
    }
}
