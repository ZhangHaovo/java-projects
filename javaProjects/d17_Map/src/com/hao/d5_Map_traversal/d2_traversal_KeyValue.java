package com.hao.d5_Map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d2_traversal_KeyValue {
    public static void main(String[] args) {
        /*键值对遍历Map
                步骤:1.先把Map集合转化成Set集合，Set集合中每一个元素都是键值对实体类型了
                    2.遍历Set集合，然后提取键以及提取值
         */
        Map<String , Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("娃娃",31);
        maps.put("iphoneX",100);
        maps.put("huawei" , 1000);
        maps.put("生活用品" , 10);
        maps.put("手表" , 10);
        System.out.println(maps);

        //可以通过调用Map的方法entrySet把Map集合转换成Set集合形式
        //Set<Map.Entry<String,integer>> entries = [(huawei=1000),(手表=10),(生活用品=10),(iphoneX=100),(娃娃=30)]      看作是一个整体
        Set<Map.Entry<String ,Integer>> entries = maps.entrySet();
        System.out.println(entries);

        //此时可以使用foreach进行遍历
        for (Map.Entry<String ,Integer> entry :entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "-->" + value);
        }

    }
}
