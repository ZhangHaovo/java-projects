package com.hao.d4_StaticUtil;
/*
1.在DemoArraysUtil中提供一个工具类方法toString,用于返回整数数组的内容，返回的字符串格式如：[10,20,30,40,50,60]
2.通常需要统计平均数，平均数为去掉最低分和最高分的平均数，请提供一个方法getAverage，用于返回平均值
 */
public class DemoArraysUtils {

    private DemoArraysUtils(){
    }

    public static String toString(int[] arr){
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s += (i == arr.length -1 ? arr[i] : arr[i] + ",");
        }
        return s + "]";
    }

    public static double getAverage(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum = sum - getMax(arr) - getMin(arr);
        return (sum/(arr.length-2));
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
