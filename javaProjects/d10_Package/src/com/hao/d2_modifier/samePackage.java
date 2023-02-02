package com.hao.d2_modifier;

public class samePackage {
    /*
    同包中的其他类：缺省、protected、public 都可以访问，private不可以访问
     */
    public static void main(String[] args) {
        Father f = new Father();
        //f.privateMethod();    报错
        f.Method();
        f.protectedMethod();
        f.publicMethod();
    }
}
