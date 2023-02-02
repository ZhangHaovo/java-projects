package com.hao.d3_ExtendsFeature;
/*
理解继承的特点
1.构造器：子类不能继承父类的构造器
2.私有成员：子类不能直接访问父类的私有成员，但是可以间接访问
3.静态成员：子类共享父类的静态成员
4.Java只支持单继承，不支持多继承。但是支持多层继承
 */

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();        //继承后成员的访问特点：就近原则
        d.showName();
    }
}

class Animal{

    public String name = "父类名";

    public void run(){
        System.out.println("动物可以跑");
    }

}

class Dog extends Animal{

    public String name = "子类名";

    public void run(){
        System.out.println("动物可以跑");
    }

    public void showName(){
        String name = "局部名";
        System.out.println(name);       //就近原则显示“局部名”
        System.out.println(this.name);  //this指向当前子类对象，显示“子类名”
        System.out.println(super.name); //super指向父类的对象，显示“父类名”
    }

}
