package com.hao.d3_HashMap_removeDuplicates;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        //HashMapʵ���Զ������ȥ��
        //HashMap�Ǹ��ݼ�ȥ���ظ�Ԫ�ص�
        Map<Student,String> maps = new HashMap<>();

        Student s1 = new Student("����",20,12.2);
        Student s2 = new Student("����",20,12.5);
        Student s3 = new Student("����",22,13.4);

        maps.put(s1,"����");
        maps.put(s2,"�Ϻ�");
        maps.put(s3,"����");

        System.out.println(maps);
    }
}
