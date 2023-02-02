package com.hao.d4_jdk8_Time;

import java.time.Month;

public class d2_LocalDate {
    public static void main(String[] args) {
        //1.获取本地日期对象
        java.time.LocalDate nowDate = java.time.LocalDate.now();
        System.out.println("今天的日期：" + nowDate);    //今天的日期

        //取年/月/日
        int year = nowDate.getYear();
        int mouth = nowDate.getMonthValue();
        int day = nowDate.getDayOfYear();
        System.out.println("年：" + year + " 月：" + mouth + " 日：" + day);

        //指定具体日期给对象
        java.time.LocalDate bt1 = java.time.LocalDate.of(1999,12,02);
        java.time.LocalDate bt2 = java.time.LocalDate.of(1999, Month.DECEMBER,02);      //用枚举的方式来表示月份
        System.out.println(bt1);
    }
}
