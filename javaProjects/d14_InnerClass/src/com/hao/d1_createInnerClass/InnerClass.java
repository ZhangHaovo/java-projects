package com.hao.d1_createInnerClass;
//��Ա�ڲ��ࣺδ��static���Σ������ⲿ��Ķ���
public class InnerClass {               //�ⲿ��
    public static String name;
    private int age;
    public class Inner{
        private String name;
        public static int a;        //jdk16��ʼ֧�־�̬��Ա

        public void show(){
            System.out.println(name);       //��Ա�ڲ�����Է����ⲿ��ľ�̬��Ա
            System.out.println(age);        //��Ա�ڲ������ֱ�ӷ����ⲿ������ʵ����Ա
        }
    }
}
