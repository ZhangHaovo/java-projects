package com.hao.d5_Map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d1_traversal_KeyFindValue {
    public static void main(String[] args) {
        /*遍历Map集合的方式：
        第一种方式：键找值
            步骤：先获取Map集合的全部键的Set集合，遍历键的Set集合，然后通过键提取对应值
         */
        Map<String , Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("娃娃",31);
        maps.put("iphoneX",100);
        maps.put("huawei" , 1000);
        maps.put("生活用品" , 10);
        maps.put("手表" , 10);
        System.out.println(maps);

        Set<String> keys = maps.keySet();
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + "-->" + value);
        }

    }
}
