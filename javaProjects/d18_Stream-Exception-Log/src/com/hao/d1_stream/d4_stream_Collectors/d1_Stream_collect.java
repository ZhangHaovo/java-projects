package com.hao.d1_stream.d4_stream_Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class d1_Stream_collect {
    public static void main(String[] args) {
        //收集Stream流的含义：就是把Stream流操作后的结果数据转回到集合或者数组中去
        //Collectors工具提供了具体的收集方法

        //目标：收集Stream流的数据到集合或者数组中去
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三三","张三三","李四四","王五","刘六");

        //将流操作过的数据收集到集合中去
        //利用toList方法将流处理的数据重新放回List集合
        Stream<String> s = list.stream().filter(o -> o.startsWith("张"));
        List<String> zhanglist = s.collect(Collectors.toList());
        System.out.println(zhanglist);
        System.out.println("-----------------------");


        //利用toSet方法将流处理的数据重新放回Set集合
        //注意：流只能收集一次，使用过的流再使用会报错，只能再次创建新的流
        Stream<String> s1 = list.stream().filter(o -> o.startsWith("张"));
        Set<String> zhangSet = s1.collect(Collectors.toSet());
        System.out.println(zhangSet);
        System.out.println("-----------------------");



        //利用toArray方法将流处理的数据重新放回数组
        Stream<String> s2 = list.stream().filter(o -> o.startsWith("张"));
//        Object[] arrs = s2.toArray();     返回一个Object的数组

//        String[] arrs = s2.toArray(new IntFunction<String[]>() {        //若要选择返回String则要重写方法
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });

//        String[] arrs = s2.toArray(s -> new String[s]);     //简化

        String[] arrs = s2.toArray(String[]::new);      //最终简化
        System.out.println(Arrays.toString(arrs));


    }
}
