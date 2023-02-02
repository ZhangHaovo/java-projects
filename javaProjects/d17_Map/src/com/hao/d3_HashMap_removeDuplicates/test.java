package com.hao.d3_HashMap_removeDuplicates;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        //HashMap实现自定义对象去重
        //HashMap是根据键去除重复元素的
        Map<Student,String> maps = new HashMap<>();

        Student s1 = new Student("张三",20,12.2);
        Student s2 = new Student("张三",20,12.5);
        Student s3 = new Student("李四",22,13.4);

        maps.put(s1,"北京");
        maps.put(s2,"上海");
        maps.put(s3,"广州");

        System.out.println(maps);
    }
}
