package com.hao.d1_Method_use;
//Java基本类型的参数传递，值传递
public class d4_Method_param {
    public static void main(String[] args) {
        System.out.println("----理解Java基本类型的参数传递，值传递----");
        int a = 10;
        change1(a);
        System.out.println(a + "（值未改变）");

        System.out.println("----理解引用类型的参数传递机制，值传递----");
        int[] arr = {0,10,20,30,40,50};
        change2(arr);
        System.out.println(arr[1] + "（值被改变）");
    }

    public static void change1(int a){
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }

    public static void change2(int arr[]){
        System.out.println(arr[1]);
        arr[1] = 20;
        System.out.println(arr[1]);
    }
}
