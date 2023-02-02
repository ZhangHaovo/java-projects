package com.hao.d2_Array_Demo;

import java.util.Scanner;

//实现冒泡排序
public class DemoBubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i,j,temp,num;
        boolean flag = false;       //标记位，false为有交换 true反之 排序中没有交换即终止程序 节约了计算机资源

        System.out.println("你想要将多少数字进行排序？");      //录入需要排序的数字个数
        num = sc.nextInt();
        int[] array = new int[num];

        System.out.println("请输入你想要排序的数字");      //录入需要排序的具体数字
        for (i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for(i = 1;i < array.length;i++) {          //冒泡的次数，（eg:5个数字排序需要冒泡4次）
            if(flag == true)                       //若没有交换则弹出循环，结束排序
                break;
            else{
                flag = true;
                for (j = 0; j < array.length - i; j++) {   //每次冒泡需要交换的次数
                    if (array[j] > array[j+1]) {          //相邻俩个数若大的数字在小的数字前面，则交换
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                        flag = false;               //若有交换则将交换位置false
                    }
                }
            }
        }
            System.out.println("排序后的顺序为");      //打印排序后的数组
            for (i = 0;i < array.length;i++)
                System.out.println(array[i]);
    }
}
