package com.hao.d1_Collection.d1_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class d1_Collection {
    public static void main(String[] args) {
        /*集合：大小可以不固定，类型也可以不固定，且只能存储引用类型数据，如果 要存储基本类型数据可以选用包装类
            1.Collection:单列，每个数据只包含一个值
            2.Map:双列，每个元素包含俩个值

        Collection:1.List系列集合:添加的元素是有序、可重复、有索引的
                        (1)ArrayList：有序，可重复，有索引的
                        (2)LinkedList：有序，可重复，有索引的
                   2.Set系列集合:添加的元素是无序，不重复，无索引的
                        (1)HashSet（无序，不重复，无索引的）:包含LinkedHashSet（有序，不重复，无索引的）
                        (2)TreeSet：按照大小默认升序排序，无重复，无索引
         */
        Collection list = new ArrayList();
        list.add("Java");
        list.add("MyBatis");
        list.add("23");
        list.add("23");
        list.add("false");
        list.add("true");
        System.out.println(list);       //元素有序、可重复、有索引的

        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("MyBatis");
        list1.add("23");
        list1.add("23");
        list1.add("false");
        list1.add("true");
        System.out.println(list1);       //元素无序，不重复，无索引的

        //集合都是支持泛型的，可以在编译阶段约束集合只能操作某种类型数据类型，集合和泛型只支持引用数据类型，不支持基本数据类型，所以集合中存储的元素都认为是对象
        Collection<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("MyBatis");
        //list2.add(23);        报错


    }
}
