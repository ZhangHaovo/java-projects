package com.hao.d1_Collection.d5_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d4_problems {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");
        list.add("Spring");
        list.add("Spring");

        //当我们从集合中找出某个元素并删除的时候可能会出现一种并发修改异常的问题
        
        //1.使用迭代器删除元素的时候
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            it.next();
            String ele = it.next();
            if ("Java".equals(ele)) {
                //list.remove("Java");        //报错，由于删除当前元素时候迭代器后移
                it.remove();        //删除当前元素，并且不会后移
            }
        }

        //2.使用foreach删除元素的时候
        for (String s : list) {
            if ("Java".equals(s)) {
                //list.remove("Java");        //报错，由于删除当前元素时候迭代器后移
            }
        }

        //3.使用Lambda删除元素的时候
        list.forEach(s ->{
            if ("Java".equals(s)) {
                //list.remove("Java");        //报错，由于删除当前元素时候迭代器后移
            }
        });

        //4.使用for遍历删除元素的时候(不会报错，但是会漏删，解决方案：倒着删除)
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if ("Java".equals(ele)) {
                list.remove("Java");
            }
        }

    }
}
