package com.hao.d1_Collection.d5_List;

import java.util.ArrayList;
import java.util.List;

public class d1_List_API {
    public static void main(String[] args) {
        //List:有序，可重复，有索引的
        //ArrayList底层是基于数组实现的，LinkedList底层基于双链表实现的

        //List所独有API
        //创建一个ArrayList集合对象
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");

        //1.在某个索引位置上插入元素
        list.add(2,"HTML");
        System.out.println(list);

        //2.根据索引删除元素，返回被删除的元素,返回值为被删除的元素
        System.out.println(list.remove(4));
        System.out.println(list);

        //3.根据索引获取元素：
        System.out.println(list.get(2));

        //4.修改索引处的元素，返回修改前的数据
        System.out.println(list.set(1,"CSS"));
        System.out.println(list);
    }
}
