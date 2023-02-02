package com.hao.d7_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class d1_APIs {
    public static void main(String[] args) {
        /**Arrays类：数组操作工具类，专门用于操作数组元素的*/

        /**public static String toString(类型[] a):返回数组内容*/
        int[] arr = {10,2,424,64,78,664,54};
        System.out.println(arr);
        String rs = Arrays.toString(arr);
        System.out.println(rs);
        System.out.println("-------------------------------");

        /**public static void sort(类型[] a):对数组进行默认升序排序*/
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------");

        /**public static <T> void sort(类型[] a,comparator<?super T>c)：使用比较器对象自定义排序*/
        Integer[] arr1 ={12,11,41,52,73,12,35};
        /**自定义比较器对象时，只支持引用类型的排序*/
        Arrays.sort(arr1,new Comparator<Integer>() {            //参数一：被排序的数组（必须是引用类型的元素）    参数二：匿名内部类对象，代表了一个比较器对象
            public int compare(Integer o1, Integer o2) {
//                if(o1 < o2) {             //返回正数就交换，不是正数就不交换
//                    return 1;
//                } else if (o1 >o2) {
//                    return -1;
//                }
//                return 0;
                return o2-o1;       //降序（o2小于o1返回负值则不交换，反之o2大于o1就不交换）
            }
        });
        System.out.println(Arrays.toString(arr1));
        System.out.println("-------------------------------");

        //public static int binarySearch(int[] a,int key)：二分法搜索数组中的数据(前提是已经排好顺序)，存在返回索引，不存在返回所要插入位置再-1
        System.out.println(Arrays.binarySearch(arr,78));
        System.out.println(Arrays.binarySearch(arr,235));
    }
}
