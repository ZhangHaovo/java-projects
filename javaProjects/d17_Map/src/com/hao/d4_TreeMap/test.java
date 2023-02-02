package com.hao.d4_TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        /*TreeMap:元素按照键是排序，不重复，无索引的，值不做要求
                    特点：1.按照键数据的大小默认升序排序，只能对键排序
                         2.TreeMap集合是一定要排序的，可以默认排序，也可以将键按照指定规则进行排序
         */
        //HashMap自定义排序规则
        Map<Apple , String> apples = new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o2.getPrice() , o1.getPrice());   //按照价格降序排序
            }
        });
        apples.put(new Apple("黄苹果","黄色",9.8,500) , "山东");
        apples.put(new Apple("富士康","红色",9.9,500) , "上海");
        apples.put(new Apple("青苹果","青色",10.2,300) , "广州");
        apples.put(new Apple("绿苹果","绿色",11.3,400) , "江西");

        System.out.println(apples);
    }
}
