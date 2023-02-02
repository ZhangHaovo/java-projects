package com.hao.d2_modifier.inner;

import com.hao.d2_modifier.Father;

public class otherPackage {
    /*
    其他包中的无关类：public 可以访问 | protected(其他包中的子类)、private、缺省 不可以访问
     */
    public static void main(String[] args) {
        Father f = new Father();
        //f.privateMethod();    报错
        //f.Method();           报错
        //f.protectedMethod();  报错
        f.publicMethod();
    }
}
