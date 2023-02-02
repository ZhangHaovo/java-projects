package com.hao.d2_SingleInstance;

public class SingleInstance2 {
    /*
    ����ģʽ�����Ա�֤ϵͳ�У�Ӧ�ø�ģʽ������Զֻ��һ��ʵ������һ����ֻ�ܴ���һ������
    ʵ�ַ�����1.��������     2.��������
     */

    //2.������������������Ҫ�����ʱ�򣬲�ȥ��������

    private SingleInstance2(){                                        //����1����������˽�л�
    }

    private static SingleInstance2 instance2;                         //����2������һ��˽�о�̬�ĳ�Ա���� ����洢һ������ֻ����һ�Σ�ֻ��һ��
                                                                            //˽�е�Ŀ�ģ����ڴ�ʱ������û�д������󣬷�ֹ����ͨ��".instance"ȡ����null,����Ϊ˽��
    public static SingleInstance2 getInstance2(){                    //����3���ṩһ�����������ⷵ�ص�������
        if(instance2 == null){                                              //����һ��ȡ����ʱ����ʱ��Ҫ��������
            instance2 = new SingleInstance2();
        }
        return instance2;                                                   //���ǵ�һ��ȡ������ֱ�ӷ��ش˶��󣬱�ֻ֤������һ������
    }
}
