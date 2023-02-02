package com.hao.d1_Array_Initialize;

public class d3_TheValueOfInitializingArray {
    public static void main(String[] args) {
        //初始化后各种数组的默认值

        //1.整数数组的默认值(为0)
        int[] array1 = new int[5];
        System.out.println(array1[0]);

        //2.字符数组的默认值（ASCII码为0的字符）
        char[] array2 = new char[5];
        System.out.println((int)array2[0]);

        //3.浮点型数组的默认值（为1.0）
        double[] array3 = new double[5];
        System.out.println(array3[0]);

        //4.布尔型数组的默认值（为false）
        boolean[] array4 = new boolean[5];
        System.out.println(array4[0]);

        //5.引用类型数组的默认值（为null）
        String[] array5 =new String[5];
        System.out.println(array5[0]);
    }
}
