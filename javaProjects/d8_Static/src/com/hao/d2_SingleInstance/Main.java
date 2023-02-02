package com.hao.d2_SingleInstance;
//����ģʽ
public class Main {
    public static void main(String[] args) {
        /*
        ��������
         */
        //SingleInstance1 u1 = new SingleInstance1();      //���������޷����ⴴ������
        SingleInstance1 u1 = SingleInstance1.instance;     //ֻ��ʹ���Ѿ������õĶ���
        SingleInstance1 u2 = SingleInstance1.instance;
        System.out.println(u1 == u2);                    //����u1��u2�ĵ�ַ�Ƿ���ͬ���жϵ���ģʽ�����Ƿ�ֻ��һ������

        /*
        ��������
         */
        //SingleInstance2 u3 = new SingleInstance2();          //���������޷����ⴴ������
        //SingleInstance2 u3 = SingleInstance2.instance2;      //�޷�ͨ��".instance"��ȡ���󣬷���u3ȡnull
        SingleInstance2 u3 = SingleInstance2.getInstance2();   //��һ��ȡ����instanceֵΪnull,��ʱ��������,u3ֵΪһ����ַ
        SingleInstance2 u4 = SingleInstance2.getInstance2();   //�ڶ��δ������󣬴�ʱinstanceֵΪ��һ�δ����Ķ�����ֱ�ӷ���
        System.out.println(u3 == u4);


    }
}
