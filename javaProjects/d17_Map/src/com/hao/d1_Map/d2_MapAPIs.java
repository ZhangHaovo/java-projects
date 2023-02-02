package com.hao.d1_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d2_MapAPIs {
    public static void main(String[] args) {
        Map<String , Integer> maps = new HashMap<>();
        //1.添加元素：无序，无重复，无索引
        maps.put("iphoneX",10);
        maps.put("娃娃",31);
        maps.put("iphoneX",100);        //Map集合后面重复的键对应的元素会覆盖全面重复的整个元素
        maps.put("huawei" , 1000);
        maps.put("生活用品" , 10);
        maps.put("手表" , 10);
        System.out.println(maps);

        //2.清空集合
//        maps.clear();
//        System.out.println(maps);

        //3.判断集合是否是空，为空返回true
        System.out.println(maps.isEmpty());

        //4.根据键获取对应值：public V get (Object key)
        Integer key = maps.get("huawei");
        System.out.println(key);

        //5.根据键删除整个元素（删除键会返回键的值）
        System.out.println(maps.remove("iphoneX"));

        //6.判断是否包含某个键，包含就返回true
        System.out.println(maps.containsKey("手表"));

        //7.判断是否包含某个值，包含就返回true
        System.out.println(maps.containsValue(10));

        //8.获取全部键的集合：public Set<K> keySet()
        Set<String> keys = maps.keySet();       //方法内部创建了对象
        System.out.println(keys);

        //9.获取全部值的集合 Collection<V> values();
        Collection<Integer> values = maps.values();     //利用Collection来接值避免了值重复被删除
        System.out.println(values);

        //10.集合的大小
        System.out.println(maps.size());

        //11.合并其他Map集合
        Map<String , Integer> maps1 = new HashMap<>();
        maps1.put("java1",1);
        maps1.put("java2",100);
        Map<String , Integer> maps2 = new HashMap<>();
        maps2.put("java2",1);
        maps2.put("java3",100);
        maps1.putAll(maps2);        //把集合maps2的元素拷贝一份到maps1中去
        System.out.println(maps1);
        System.out.println(maps2);
    }
}
