package com.hao.d2_Interface;
/*
�ӿڵ�ע������
    1.�ӿڲ��ܴ�������
    2.һ����ʵ���˶���ӿڣ�����ӿ�����ͬ�ľ�̬��������̬��������ͻ
    3.һ����̳��˸��࣬ͬʱʵ���˽ӿڣ������кͽӿ��д���ͬ���ķ�����Ĭ��ʹ�ø����
 */
public class InterfaceAttention {
    public static void main(String[] args) {
        Dog g = new Dog();
        g.eat();        //����̳и���ͬʱʵ�ֽӿڣ������кͽӿ�����ͬ��������Ĭ��ʹ�ø����
    }
}

interface Food{
    default void eat(){
        System.out.println("�ӿ��е�ͬ������");
    }
}

class Animal{
    public void eat(){
        System.out.println("�����е�ͬ������");
    }
}

class Dog extends Animal implements Food{       //����̳и���ͬʱʵ�ֽӿ�
}
