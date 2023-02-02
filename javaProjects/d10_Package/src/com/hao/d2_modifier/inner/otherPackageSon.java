package com.hao.d2_modifier.inner;

import com.hao.d2_modifier.Father;

public class otherPackageSon extends Father {
    /*
    其他包中的子类：protected、public 可以访问 | private、缺省 不可以访问
     */
    public static void main(String[] args) {
        otherPackageSon son = new otherPackageSon();
        //son.privateMethod();  报错
        //son.Method();         报错
        son.protectedMethod();
        son.publicMethod();

        Father f = new Father();        //使用父类只能访问public
        //f.privateMethod();
        //f.Method();
        //f.protectedMethod();
        f.publicMethod();
    }
}
