package com.hao.d5_Map_traversal;

import java.util.HashMap;
import java.util.Map;

public class d3_traversal_Lambda {
    public static void main(String[] args) {
        //Lambda表达式
        Map<String , Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("娃娃",31);
        maps.put("iphoneX",100);
        maps.put("huawei" , 1000);
        maps.put("生活用品" , 10);
        maps.put("手表" , 10);
        System.out.println(maps);

//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + "-->" + value);
//            }
//        });
        //简化形式
        maps.forEach((key,value) -> {
            System.out.println(key + "-->" + value);
        });
    }
}
