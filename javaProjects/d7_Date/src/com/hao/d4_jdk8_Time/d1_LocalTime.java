package com.hao.d4_jdk8_Time;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class d1_LocalTime {
    public static void main(String[] args) {
        //获取本地时间对象
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);        //今日的时间

        //取时/分/秒/纳秒
        int hour = nowTime.getHour();
        int minute = nowTime.getMinute();
        int second = nowTime.getSecond();
        int nano = nowTime.getNano();       //纳秒
        System.out.println("Hour:" + hour + " Minute:" + minute + " Second:" + second + " Nano:" + nano);

        //指定具体时间给时间对象
        LocalTime lt = LocalTime.of(8,24,30,13532);
        System.out.println(lt);
        LocalDateTime ldt = LocalDateTime.of(1999,12,02,8,20,23,245353);
        System.out.println(ldt);
    }
}
