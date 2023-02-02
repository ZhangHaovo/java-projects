package com.hao.d1_Method_use;
//识别方法重载的形式，理解其调用的流程
public class d5_Method_Overload {
    public static void main(String[] args) {
        fire();
        fire("American");
        fire("American",5);
    }

    public static void fire(){
        System.out.println("默认发射1枚导弹");
    }

    public static void fire(String location){
        System.out.println("发射1枚导弹到" + location );
    }

    public static void fire(String location, int number){
        System.out.println("发射"+ number + "枚导弹到" + location );
    }
}
