package com.hao.d3_Demo;

public class Mouse implements USB{
    private String name;

    public Mouse(String name) {
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
        System.out.println(name + "��������ӵ���");
    }

    @Override
    public void disconnect() {
        System.out.println(name + "���Ͽ�����");
    }

    public void click(){
        System.out.println("��꿪ʼ����");
    }
}
