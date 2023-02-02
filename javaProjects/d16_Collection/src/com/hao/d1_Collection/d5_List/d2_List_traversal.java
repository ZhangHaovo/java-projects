package com.hao.d1_Collection.d5_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d2_List_traversal {
    public static void main(String[] args) {
        //List集合的遍历方式:

        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");

        //1.for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2.迭代器
        System.out.println("---------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //3.foreach
        System.out.println("----------------");
        for (String s : list) {
            System.out.println(s);
        }

        //4.Lambda表达式
        System.out.println("----------------");
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
