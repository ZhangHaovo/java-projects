package com.hao.d3_Demo;

public class Keyboard implements USB{
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "���������ӵ���");
    }

    @Override
    public void disconnect() {
        System.out.println(name + "���̶Ͽ�����");
    }

    public void write(){
        System.out.println("���̿�ʼ��������");
    }
}
