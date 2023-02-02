package com.hao.d3_createObject;

public class Car {
    //变量成员
    String name = "没有车";
    double price;
    //行为（使用方法定义）
    public void start(){
        System.out.println(name + "启动了");
    }
    public void run(){
        System.out.println(name + "起步了");
    }
}