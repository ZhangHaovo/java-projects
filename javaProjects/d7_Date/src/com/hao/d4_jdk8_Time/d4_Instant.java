package com.hao.d4_jdk8_Time;
//时间戳：获取特别简单，且功能丰富

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class d4_Instant {
    public static void main(String[] args) {
        //得到一个时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);        //世界标准时间

        System.out.println(instant.atZone(ZoneId.systemDefault()));     //获取当地时间

        //Instant和Date俩个类可以相互转换
        Date date = Date.from(instant);
        System.out.println(date);
        Instant i2 = date.toInstant();
        System.out.println(i2);
    }
}
