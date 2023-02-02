package com.hao.d1_Collection.d10_Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class d4_Set_TreeSet {
    public static void main(String[] args) {
        /*TreeSet�����մ�СĬ�������������ظ���������
                ԭ�����ں���������ݽṹʵ��������ɾ�Ĳ�����ܶ��Ϻ�
                ע�⣺TreeSet������һ��Ҫ���򣬿��Խ�Ԫ�ذ���ָ���Ĺ����������
                TreeSet����Ĭ�ϵĹ��򣺶�����ֵ���ͣ�Integer,Double��:1.����Ĭ�ϰ��մ�С������������ 2.�����ַ������ͣ�Ĭ�ϰ������ַ��ı����������    3.�����Զ������ͣ�TreeSet�޷�ֱ������
         */
        Set<Integer> sets1 = new TreeSet<>();
        sets1.add(23);
        sets1.add(13);
        sets1.add(33);
        System.out.println(sets1);      //����Ĭ�ϰ��մ�С������������


        Set<String> sets2 = new TreeSet<>();
        sets2.add("Java");
        sets2.add("Zhang");
        sets2.add("Python");
        sets2.add("Python");
        sets2.add("���");
        System.out.println(sets2);      //�����ַ������ͣ�Ĭ�ϰ������ַ��ı����������

        System.out.println("-----------------------------");
        
        //�Զ����������
        //��ʽһ�����Զ������ʵ��Comparable�ӿ���д�����comparableTo������ָ���ȽϹ���

        //��ʽ����TreeSet�����в�������������������Comparable�ӿڶ�Ӧ�ıȽ����������ƶ��ȽϹ���]
        //ע�⣺���TreeSet���ϴ洢�Ķ�����ʵ�ֱȽϹ��򣬼���Ҳ�Դ��Ƚ�����Ĭ��ʹ�ü����Դ��ıȽ�������
        Set<d5_Set_TreeSet_classApple> apples = new TreeSet<>(new Comparator<d5_Set_TreeSet_classApple>() {
            @Override
            public int compare(d5_Set_TreeSet_classApple o1, d5_Set_TreeSet_classApple o2) {
                return o1.getWeight() - o2.getWeight();
                //return Double.compare(o2.getPrice , o1.getPrice);         �����ͽ���ֱ����Double.compare���бȽ�
            }
        });
        //Set<d5_Set_TreeSet_classApple> apples = new TreeSet<>(((o1, o2) -> Double.compare(o2.getWeight(), o1.getWeight())));      ����ʽ
        apples.add(new d5_Set_TreeSet_classApple("��ƻ��","��ɫ",9.8,500));
        apples.add(new d5_Set_TreeSet_classApple("��ʿ��","��ɫ",9.9,500));
        apples.add(new d5_Set_TreeSet_classApple("��ƻ��","��ɫ",10.2,300));
        apples.add(new d5_Set_TreeSet_classApple("��ƻ��","��ɫ",11.3,400));
        System.out.println(apples);



    }
}
