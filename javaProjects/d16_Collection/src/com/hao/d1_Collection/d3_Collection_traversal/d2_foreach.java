package com.hao.d1_Collection.d3_Collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class d2_foreach {
    public static void main(String[] args) {
        /*
        ��ǿforѭ�����ȿ��Ա��������ֿ��Ա�������
            ��ʽ��for(Ԫ���������� ���������������Collection����) {
                //�ڴ˴�ʹ�ñ������ɣ��ñ�������Ԫ��
            }
         */
        Collection<String> list = new ArrayList<>();
        list.add("����");
        list.add("����");
        list.add("����");
        list.add("����");

        for (String ele : list){
            System.out.println(ele);
        }

        System.out.println("-----------------------------");
        double[] scores = {100,99.3,34.3};
        for (double score : scores) {
            System.out.println(score);
        }
    }
}
