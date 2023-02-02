package com.hao.d1_stream.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class d1_stream_Demo {
    public static void main(String[] args) {
        /*
        Stream:得益于Lambda所带的函数式编程，引入了Stream流概念
            目的：用于简化集合和数组操作的API
            非终结方法：也称中间方法，调用完成后返回新的Stream流可以继续使用，支持链式编程
            终结方法：此类方法无法继续操作流，例如：forEach、count
            注意：在Stream中无法直接修改集合，数组中的数据
         */
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张三四","张一二","李四四","王五四","刘六四","张强");
        System.out.println(names);

//        List<String> zhangList = new ArrayList<>();
//        for (String name : names) {
//            if (name.startsWith("张")){
//                zhangList.add(name);
//            }
//        }
//        System.out.println(zhangList);
//
//        List<String> zhangThreeList = new ArrayList<>();
//        for (String name : zhangThreeList) {
//            if (name.length() == 3) {
//                zhangThreeList.add(name);
//            }
//        }
//        System.out.println(zhangThreeList);

        //使用stream来实现
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
