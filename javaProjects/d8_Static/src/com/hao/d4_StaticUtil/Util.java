package com.hao.d4_StaticUtil;

import java.util.Random;

public class Util {
    //工具类：类中都是一些静态方法，每个方法都是以完成一个公共的功能为目的，这个类用来给开发人员共同使用的

    //由于工具类无需创建对象，所以把其构造器私有化，防止被创建对象，更加严谨
    private Util(){         //私有构造器后，默认构造器被顶替
    }

    //静态方法:n位验证码功能
    public static String verificationCode(int n){
        Random  r = new Random();
        String code = "";
        String Order ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < n; i++) {
            code += Order.charAt(r.nextInt(Order.length()));
        }
        return code;
    }

}
