package com.hao.d4_Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class d2_DemoLambda {
    public static void main(String[] args) {
        Integer[] arr1 ={12,11,41,52,73,12,35};

//        Arrays.sort(arr1,new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });

        //简化形式
//        Arrays.sort(arr1,(Integer o1, Integer o2)->{
//            return o2 - o1;
//        });

        //更为简化的形式
//        Arrays.sort(arr1,(o1, o2) -> {      //省略参数类型
//            return o2 - o1;
//        });

        //更更为简化的形式
        Arrays.sort(arr1,(o1, o2) -> o2 - o1);      //只有一行代码时省略大括号和分号，且是return的话省略return

        System.out.println(Arrays.toString(arr1));
    }
}
