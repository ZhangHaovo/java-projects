package com.hao.d4_ExtendsConstructor;
//子类构造器如何访问父类有参构造器
public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("张三",18);
    }
}

class People{                                           //父类
    private String name;
    private int age;

    public People() {                                   //无参构造器,由于子类默认调用父类的无参构造器，所以建议加上父类无参构造器
    }

    public People(String name, int age) {               //有参构造器
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher extends People{                           //子类
    public Teacher(){
        super();                            //系统默认添加super();调用父类的无参构造器
    }
    public Teacher(String name, int age){               //调用父类的构造器：初始化继承自父类的数据
        super(name,age);
    }
}
