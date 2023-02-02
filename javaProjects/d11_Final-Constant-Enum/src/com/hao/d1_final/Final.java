package com.hao.d1_final;
/*
final���η������ã�
    1.�����ࣺ����������������࣬���ܱ��̳�
    2.���η���������������������շ��������ܱ���д
    3.���α��������������������ֵ֮���ܱ��ٴθ�ֵ������ֻ�ܱ���ֵһ�Σ�
            final���ε��ǻ������ͣ���ô�������������ֵ���ܱ��ı�
            final���ε����������ͣ���ô�����洢�ĵ�ֵַ���ܱ��ı䣬���ǵ�ַָ��Ķ��������ǿ��Է����ı��
 */
public class Final {
    public static void main(String[] args) {
      /*
      ���final���γ�Ա���������ã��ܹ��򣺱������ҽ��ܱ���ֵһ��

      ���������ࣺ
      1.�ֲ�����
      2.��Ա������
            ��1��.ʵ����Ա����
            ��2��.��̬��Ա����
       */
        final double rate = 3.14;
       //rate = 2.123;    fianl���α������ܱ��ٴθ���
    }
}

class People{
    final public void eat(){
        System.out.println("�Զ���");
    }
}

class Student extends People{
    /*
    2.final���η���ʱ���������ܱ���д
    @Override
    public void eat() {
        super.eat();
    }
     */
}



//1.final������(�������ι������⣬һ�㲻��final������)�����������࣬���ܱ��̳�
/*
final class Animal{
}

class dog extends Animal{       ����������̳�
}
 */
