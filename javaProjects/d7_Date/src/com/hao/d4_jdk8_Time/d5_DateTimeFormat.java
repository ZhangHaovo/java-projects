package com.hao.d4_jdk8_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//日期时间格式器，正反都能调用format方法
public class d5_DateTimeFormat {
    public static void main(String[] args) {

        //本地此刻时间对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //解析格式化器
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

        //正向格式化
        String ldtStr = dtf.format(ldt);
        System.out.println(ldtStr);

        //逆向格式化
        String ldtStr1 = ldt.format(dtf);
        System.out.println(ldtStr1);

        //解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateStr = "2019-11-11 11:11:11";
        LocalDateTime ldt1 = LocalDateTime.parse(dateStr,dtf1);
        System.out.println(ldt1);

    }
}
