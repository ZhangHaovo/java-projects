package com.hao.d2_SingleInstance;
//���ģʽ���ڿ���������һЩ���⣬һ������ͨ����n�ֽ��������������һ�ֽ������ŵģ�������Žⱻ�ܽ�Ϊ���ģʽ
public class SingleInstance1 {

    /*
    ����ģʽ�����Ա�֤ϵͳ�У�Ӧ�ø�ģʽ������Զֻ��һ��ʵ������һ����ֻ�ܴ���һ������
    ʵ�ַ�����1.��������     2.��������
     */

    //1.�����������������ȡ����ʱ�������Ѿ���������
    private SingleInstance1(){                                              //����1����������˽�л�
    }

    public static SingleInstance1 instance = new SingleInstance1();         //��ǰ׼��һ�����󣬴˶���ֻ����һ����������static����

}
