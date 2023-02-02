package com.hao.d1_createstatic;

public class StaticField {
    /**静态成员变量：用static修饰，可以被共享*/
    public static int onlineNumber = 167;

    /**实例成员变量：属于每个对象的，必须由对象名.访问*/
    private String name;
    int age;

    public static void main(String[] args) {
        /**静态成员变量访问的俩种方式*/

        /**1.类名.静态成员变量（推荐）*/
        System.out.println(StaticField.onlineNumber);
        /**2.生成对象，对象.成员变量(不推荐)*/
        StaticField u1 = new StaticField();
        System.out.println(u1.onlineNumber);

        /*实例成员变量访问的方式：对象.成员变量*/
        StaticField u2 = new StaticField();
        System.out.println(u2.name);    //直接StaticField.name 报错
    }
}
