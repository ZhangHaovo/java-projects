package com.hao.d4_ExtendsConstructor;
/*
认识继承后子类构造器的特点：
    子类的全部构造器默认会先访问父类的无参构造器再执行自己
 */
public class Test1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println("-----------------------");
        Dog d2 = new Dog("金毛");

    }
}

class Animal{
    public Animal(){
        System.out.println("父类的无参构造器被执行了");
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("子类的无参构造器被执行了");
    }
    public Dog(String name){
        System.out.println("子类的有参构造器被执行了");
    }
}