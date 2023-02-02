package com.hao.d2_constructor;
//构造器：定义在类中，用于初始化一个类的对象，并返回对象的地址
//认识构造器，明白俩种类型构造器的作用
public class Main {
    public static void main(String[] args) {
        //通过调用构造器来构建对象
        Car car1 = new Car();       //调用无参构造器
        System.out.println(car1.name);
        System.out.println(car1.price);

        Car car2 = new Car("BMW",30);   //调用有参构造器
        System.out.println(car2.name);
        System.out.println(car2.price);
    }
}
