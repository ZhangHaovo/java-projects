package com.hao.d1_Collection.d9_genericity_limit;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        //����ͨ�����������
        //ͨ������������ڡ�ʹ�÷��͡���ʱ�����һ�����ͣ�ETKV���ڶ��巺�͵�ʱ��ʹ�õ�
        //���͵������ޣ���1��?extends Car :?������Car���������� ��ָ����     ��2��?super Car :?������Car�����丸�� ��ָ����
        }
        public static void go(ArrayList<? extends Car> cars){     //��ȻBMW��BENS���̳�CAR����ArrayList<BMW>��ArrayList<BENS>��ArrayList<Car>û�й�ϵ extends carsֻ�������cars�ļ̳���
    }
}

class BMW extends Car {

}

class BENS extends Car {

}

class Car{

}

