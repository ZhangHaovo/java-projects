package com.hao.Demo;

import java.util.Random;

public class empty {
    public static void main(String[] args) {
        Random r = new Random();
        String verificationNum = "";
        String Order = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 5; i++) {
            verificationNum += Order.charAt(r.nextInt(62));
        }
        System.out.println(verificationNum);
    }
}
