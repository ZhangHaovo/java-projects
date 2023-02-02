package com.hao.d1_javabean;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();       //调用无参构造器
        u1.setName("张三");
        u1.setNum(001);
        u1.setScore(98);
        System.out.println(u1.getName());
        System.out.println(u1.getNum());
        System.out.println(u1.getScore());

        User u2 = new User("李四",002,97);        //调用有参构造器
        System.out.println(u2.getName());
        System.out.println(u2.getNum());
        System.out.println(u2.getScore());
    }
}
