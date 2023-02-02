package com.hao.d1_Array_Initialize;

public class d2_ArrayStaticInitialize {
    public static void main(String[] args) {

        //double[] numbers1 = new double[]{12.3,123.23,131.23,23.23,23.2,46.4};
        //double[] numbers1 = {12.3,123.23,131.23,23.23,23.2,46.4};
        double numbers1[] = {12.3,123.23,131.23,23.23,23.2,46.4};   //简化写法

        //2个数组变量指向同一个数组对象
        double[] numbers2 = numbers1;

        int i;
        for (i=0;i<6;i++) {
            System.out.println(numbers1[i]);
            System.out.println(numbers2[i]);
        }

        System.out.println(numbers1.length);        //输出数组的长度
    }
}
