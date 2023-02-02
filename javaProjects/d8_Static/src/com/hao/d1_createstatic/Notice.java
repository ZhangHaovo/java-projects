package com.hao.d1_createstatic;

public class Notice {
    public static int onlineNumber = 10;        //静态成员

    private String name;                        //实例成员
    private int number;

    public void run(){                          //实例方法，既能访问静态成员，也能直接访问实例成员
        System.out.println("实例成员方法");
        System.out.println(onlineNumber);       //可以访问静态成员
        test1();                                //可以访问静态方法
        System.out.println(name);               //可以访问实例成员
        run();                                  //可以访问实例方法
    }

    public static void test(){                  //静态方法，只能访问静态成员，不能直接访问实例成员，静态方法不能出现this指针（this代表当前对象，而静态方法无需对象也可以调出）
        System.out.println("静态成员方法");
        System.out.println(onlineNumber);       //可以访问静态成员
        test1();                                //可以访问静态方法
        //System.out.println(name);             //不可以访问实例成员
        //run();                                //不可以访问实例方法
    }

    public static void test1(){
        System.out.println("test1");
    }
}
