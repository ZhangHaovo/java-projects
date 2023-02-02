package com.hao.d2_HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class d2_LinkedHashMap {
    public static void main(String[] args) {
        //HashMap:元素按照键是有序，不重复，无索引，值不做要求的
        Map<String , Integer> maps = new LinkedHashMap<>();
        maps.put("Java",1);
        maps.put("HTML",3);
        maps.put("CSS",6);
        maps.put("Java",1);     //覆盖前面的元素
        maps.put(null,null);
        System.out.println(maps);
    }
}
