package com.hao.d2_DemoExtends;
//ѧ�������ƣ����䣬���ڰ༶���鿴�α���д���η���
//��ʦ�����ƣ����䣬�������ڣ��鿴�α���������
public class People {
    private String name;
    private int age;

    public void check(String name){
        System.out.println(name + "���ڲ鿴�α�");
     }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
