package com.hao.d1_stream.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class d3_streamAPIs {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三三","张三三","李四四","王五","刘六");

        //filter:过滤元素
        list.stream().filter(s ->s.startsWith("张")).forEach(s -> System.out.println(s));

        //count：计数(终结方法)
        long size = list.stream().filter(s -> s.length()==2).count();
        System.out.println(size);

        //limit:取前几个元素·
//        list.stream().filter(s -> s.length()==3).limit(2).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.length()==3).limit(2).forEach(System.out::println);      //简化

        //skip:跳过前几个
        list.stream().filter(s -> s.length()==3).skip(1).forEach(System.out::println);

        //map:加工方法(第一个参数是原材料，第二个参数是加工后的结果)
        //需求：每一个名字前面加上一个字符
        list.stream().map(s -> "加工后"+s).forEach(s -> System.out.println(s));
        //需求：把所有的名称都加工成一4个学生对象
//        list.stream().map(s -> new d4_classStudent(s)).forEach(s -> System.out.println());
        list.stream().map(d4_classStudent::new).forEach(System.out::println);       //简化：构造器引用，方法引用

        //concat:合并流
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<Integer> s2 = Stream.of(313,644);
        Stream<Object> s3 = Stream.concat(s1,s2);       //合并流的类型一定要是俩个流的父类类型
        s3.forEach(s -> System.out.println(s));

        //distinct:去重复
        s3.distinct().forEach(s-> System.out.println(s));

    }
}
