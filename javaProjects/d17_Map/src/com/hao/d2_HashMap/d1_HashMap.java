package com.hao.d2_HashMap;

import java.util.HashMap;
import java.util.Map;

public class d1_HashMap {
    public static void main(String[] args) {
        //HashMap:元素按照键是无序，不重复，无索引，值不做要求的（与Map体系一致）
        //HashMap底层是哈希表结构的，依赖hashCode方法和equals方法保证键的唯一
        Map<String , Integer> maps = new HashMap<>();
        maps.put("Java",1);
        maps.put("HTML",3);
        maps.put("CSS",6);
        maps.put("Java",1);     //覆盖前面的元素
        maps.put(null,null);
        System.out.println(maps);
    }
}
