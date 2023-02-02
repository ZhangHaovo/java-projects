package com.hao.d1_stream.d2_stream;
import java.util.*;
import java.util.stream.Stream;

public class d2_stream {
    public static void main(String[] args) {
        //Collection集合获取流
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        //Map集合获取流
        Map<String, Integer> maps = new HashMap<>();
        //键流
        Stream<String> keyStream = maps.keySet().stream();
        //值流
        Stream<Integer> valueStream = maps.values().stream();
        //键值对流
        Stream<Map.Entry<String,Integer>> keyValueStream = maps.entrySet().stream();

        //数组传输流
        String[] names = {"张三","李四","王五","刘六"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
     }
}
