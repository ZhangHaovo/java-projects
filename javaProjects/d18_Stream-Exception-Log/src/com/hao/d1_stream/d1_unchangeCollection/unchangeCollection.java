package com.hao.d1_stream.d1_unchangeCollection;

public class unchangeCollection {
    public static void main(String[] args) {
        //不可变集合：集合的数据项在创建的时候提供，并且在整个生命周期中都不可以改变，否则报错
        //创建不可变集合的原因：某个数据不能被修改，把它防御性地拷贝到不可变集合中去；或者当集合对象被比可行的库调用时，不可变形式是安全的
        //创建不可变集合的方法：在List、Set、Map接口中，都存在of方法，可以创建一个不可变集合

//        List<Double> lists = lists.of(12.213);
////        lists.add(98.2);      报错，不.3可变集合无法添加数据
//        System.out.println(lists);
//
//        //可以将元素拿出来进行操作
//        double score = lists.get(1);
//        System.out.println(score);
    }
}
