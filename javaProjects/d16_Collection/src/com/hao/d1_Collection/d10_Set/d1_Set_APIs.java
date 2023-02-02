package com.hao.d1_Collection.d10_Set;

import java.util.HashSet;
import java.util.Set;

public class d1_Set_APIs {
    public static void main(String[] args) {
        /*
        Setϵ�м���:��ӵ�Ԫ��������(��ȡ˳��һ��)�����ظ�������ȥ�ظ�������������
                        (1)HashSet�����򣬲��ظ����������ģ�:����LinkedHashSet�����򣬲��ظ����������ģ�
                        (2)TreeSet�����մ�СĬ�������������ظ���������
        Set���ϵĹ����ϻ�����Collection��APIһ��
         */
        Set<String> sets  = new HashSet<>();
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("SPRING");
        sets.add("MyBaits");
        System.out.println(sets);

    }
}
