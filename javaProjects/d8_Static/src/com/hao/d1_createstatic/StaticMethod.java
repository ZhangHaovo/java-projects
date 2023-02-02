package com.hao.d1_createstatic;

public class StaticMethod {
    private String name;

    //静态成员方法：用static修饰，属于类，可以被共享      /*如果该方法是以执行一个共用功能为目的，则可以申明成静态方法
    public static int getMax(int a ,int b){
        return a > b ? a : b;

    }

    //实例方法：属于对象的，只能由对象触发访问。            /*表示对象自己的行为，且在方法中需要访问实例成员，则该方法必须申明成实例方法*/
    public void study(){
        System.out.println(name);
    }

    public static void main(String[] args) {

        StaticMethod u1 = new StaticMethod();             //实例方法调用方法：对象名.实例方法
        u1.name = "张三";
        u1.study();

        System.out.println(getMax(3,2));            //静态成员方法调用方法1：类名.静态成员方法（推荐）

        System.out.println(u1.getMax(12,41));       //静态成员方法调用方法2：对象.静态成员方法（不推荐）
    }
}
