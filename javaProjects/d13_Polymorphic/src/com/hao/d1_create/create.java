package com.hao.d1_create;
/*��̬��ͬ���͵Ķ���ִ��ͬһ����Ϊ������ֳ���ͬ����Ϊ����
    1.�ŵ㣺
        ��1��.�ڶ�̬��ʽ�£��ұ߶������ʵ�ֽ���ϣ�������չ��ά��  //9
        ��2��.���巽��ʱ��ʹ�ø�����Ϊ�������÷����Ϳ��Խ����⸸���һ���Ӷ������ֳ���̬����չ�Ժͱ���   //18
    2.���⣺��̬�²���ʹ������Ķ����������������������ת����
 */
public class create {
    public static void main(String[] args) {
        //��̬����ʽ: �������� �������� = new ���๹����
        Animal d = new Dog();               //�������ã����뿴��ߣ����п��ұ�
        d.run();
        System.out.println(d.name);         //�������ã����뿴��ߣ�����Ҳ�����
        go(d);

        Animal t = new Tortoise();
        t.run();
        go(t);
    }


    public static void go(Animal a){        //�β�ʹ�ø���Animal�����Խ���һ���Ӷ���
        System.out.println("��ʼ");
        a.run();
    }
}
