package com.hao.d5_Map_traversal;

import java.util.HashMap;
import java.util.Map;

public class d3_traversal_Lambda {
    public static void main(String[] args) {
        //Lambda���ʽ
        Map<String , Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("����",31);
        maps.put("iphoneX",100);
        maps.put("huawei" , 1000);
        maps.put("������Ʒ" , 10);
        maps.put("�ֱ�" , 10);
        System.out.println(maps);

//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + "-->" + value);
//            }
//        });
        //����ʽ
        maps.forEach((key,value) -> {
            System.out.println(key + "-->" + value);
        });
    }
}
