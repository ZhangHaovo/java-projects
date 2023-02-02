package com.hao.d2_InnerClassAnonymous;
/*�����ڲ��ࣺ��������û�����ֵľֲ��ڲ��࣬�����ڷ����С�������е�
        1.���ã����㴴�������������Ŀ���Ǽ򻯴����д
        2.��ʽ��   new ��|���󷽷�|�ӿ���(){                               eg: Employee a = new Employee(){
                        ��д����                                                public void work(){
                  };                                                           }
                                                                           };
                                                                           a.work();
        3.�ص㣺�����ڲ���д�����ͻ����һ�������ڲ���Ķ���������������൱���ǵ�ǰnew�����͵���������
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("Tiger Run");
            }
        };
        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}

//class Tiger extends Animal{
//    @Override
//    public void run() {
//        System.out.println("Tiger Run");
//    }
//}
