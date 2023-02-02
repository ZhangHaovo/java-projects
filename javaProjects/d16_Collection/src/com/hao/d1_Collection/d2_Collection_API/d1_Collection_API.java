package com.hao.d1_Collection.d2_Collection_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class d1_Collection_API {
    public static void main(String[] args) {
        /*
        Collection是单列的集合的祖宗元素，他的功能是全部单列集合都可以继承使用的
         */
        Collection<String> list = new ArrayList<>();

        //1.添加元素，添加成功返回true
        list.add("Java");
        list.add("MyBatis");
        list.add("MyBatis");

        //2.判断集合是否为空，空返回true
        System.out.println(list.isEmpty());

        //3.获取集合的大小
        System.out.println(list.size());

        //4.判断集合中是否包含某个元素
        System.out.println(list.contains("Java"));
        System.out.println(list.contains("java"));      //false
        System.out.println(list.contains("MyBatis"));

        //5.删除某个元素
        System.out.println(list.remove("Java"));     //如果有多个成功重复的元素，则默认删除第一个

        //6.清空数组
        list.clear();

        //7.将集合转换成数组
        list.add("Java");
        list.add("MyBatis");
        list.add("MyBatis");

        Object[] arrs = list.toArray();        //由于数组中可能含有不同类型的元素，所以用Object数组来接
        System.out.println("数组：" + Arrays.toString(arrs));

        System.out.println("------------------------扩展-----------------------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("Java1");
        c1.add("Java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("MyBatis1");
        c2.add("MyBatis2");

        //将c2集合中的元素全部倒入c1中去
        c1.addAll(c2);
        System.out.println(c1);



    }
}
