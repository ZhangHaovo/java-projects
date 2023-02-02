package com.hao.d1_Collection.d6_genericity_class;

public class d1_Test {
    public static void main(String[] args) {
        /*
        ���ͣ�(1)���;���һ����ǩ
             (2)���Ϳ����ڱ���׶�Լ��ֻ�ܲ���ĳ����������
             (3)����ֻ��֧��������������
         */

        //�Զ��巺��:����׶�Լ�����������ݵ����ͣ������ڼ��ϵ�����9+


        //����ģ��ArrayList����һ��MyArrayList ��ע���͵����
        d2_MyArrayList<String> list = new d2_MyArrayList<>();
        list.add("Java");   //ֻ�ܲ����ַ���

        d2_MyArrayList<Integer> list1 = new d2_MyArrayList<>();
        list1.add(12);      //ֻ�ܲ�������
    }
}
