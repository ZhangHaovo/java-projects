package com.hao.d1_Collection.d3_Collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class d3_Lambda {
    public static void main(String[] args) {
        //Collection���Lambda������API
        Collection<String> list = new ArrayList<>();
        list.add("����");
        list.add("����");
        list.add("����");
        list.add("����");

//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        list.forEach(s -> System.out.println(s));

//        list.forEach(System.out::println);        ����ʽ
    }
}
