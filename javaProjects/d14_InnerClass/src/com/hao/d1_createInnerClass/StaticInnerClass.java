package com.hao.d1_createInnerClass;
//��̬�ڲ��ࣺ��static���Σ������ⲿ�౾��
public class StaticInnerClass {
    public static String classNum;
    private String age;
    public static class Inner{                  //�ڲ���
        private String name;

        public void show(){
            System.out.println(classNum);       //����ֱ�ӷ��ʾ�̬��Ա����
            //System.out.println(age);          //������ֱ�ӷ����ⲿ��ĳ�Ա����
            StaticInnerClass o = new StaticInnerClass();
            System.out.println(o.age);          //���������ⲿ��Ķ����ӷ���ʵ����Ա
        }

        public Inner() {
        }

        public Inner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
