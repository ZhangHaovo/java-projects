package com.hao.d1_Collection.d10_Set;

public class d2_Set_HashSet {
    public static void main(String[] args) {
        //��ϣֵ����JDK���ݶ���ĵ�ַ������ĳ�ֹ����������int���͵���ֵ
        //Object���API��public int HashCode()�����ض���Ĺ�ϣֵ
        //����Ĺ�ϣֵ�ص㣺1.ͬһ�������ε���hashCode()�������صĹ�ϣֵ����ͬ��    2.Ĭ������£���ͬ����Ĺ�ϣֵ�ǲ�ͬ��

        //��ȡ����Ĺ�ϣֵ
        String name = "����";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());
    }
}
