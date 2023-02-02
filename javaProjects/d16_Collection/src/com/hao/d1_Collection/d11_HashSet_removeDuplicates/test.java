package com.hao.d1_Collection.d11_HashSet_removeDuplicates;

import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {

        //目标：让Set集合把重复内容的自定义对象去掉一个
        Set<Student> sets = new HashSet<>();
        Student s1 = new Student("张三",20,'男');
        Student s2 = new Student("张三",20,'男');
        Student s3 = new Student("李四",22,'男');

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);

        //Set集合去重复的原因：先判断哈希值，再判断equals
        System.out.println(sets);       //未重写equals和hashCode方法前sets中s1与s2并不会去重，重写后会去重
    }
}
