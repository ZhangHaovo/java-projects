package com.hao.d7_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class d2_DemoAPIs {
    public static void main(String[] args) {
        //Arrays����Ӧ���ڶ�������
        d2_DemoAPIs_Student[] students = new d2_DemoAPIs_Student[3];
        students[0] =new d2_DemoAPIs_Student("����",21,175.2);
        students[1] =new d2_DemoAPIs_Student("����",20,173.9);
        students[2] =new d2_DemoAPIs_Student("����",19,177.5);
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new Comparator<d2_DemoAPIs_Student>() {
            @Override
            public int compare(d2_DemoAPIs_Student o1, d2_DemoAPIs_Student o2) {
//                return o1.getAge() - o2.getAge();       //������������Ĺ����������
                return Double.compare(o1.getHeight(), o1.getHeight());      //����С�����ΪС�������Ա���ʹ��Double�ṩ��API
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
