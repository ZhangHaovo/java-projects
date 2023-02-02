package com.hao.d4_jdk8_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;

public class d3_LocalDateTime {
    public static void main(String[] args) {
        ////获取本地日期时间对象
        LocalDateTime nowDateTime = LocalDateTime.now();

        //取具体日期时间
        System.out.println(nowDateTime.getYear());  //年
        System.out.println(nowDateTime.getMonth()); //月（英文）
        System.out.println(nowDateTime.getMonthValue());    //月（阿拉伯数字）
        System.out.println(nowDateTime.getDayOfMonth());  //月中日
        System.out.println(nowDateTime.getDayOfWeek());     //周中日（英文）
        System.out.println(nowDateTime.getDayOfWeek().getValue());  //周中日（阿拉伯数字）
        System.out.println(nowDateTime.getHour());  //时
        System.out.println(nowDateTime.getMinute());    //分
        System.out.println(nowDateTime.getSecond());    //秒
        System.out.println(nowDateTime.getNano());      //纳秒

        //日期时间对象能够转成日期/时间对象
        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());

        /*相关API
        LocalDateTime 综合了LocalDate和LocalTime里面的方法，这些方法返回的是一个新的实例引用，原本的不变
         */
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);    //当前时间
        System.out.println(nowTime.minusHours(1));  //1小时前
        System.out.println(nowTime.minusMinutes(1));  //1分钟前
        System.out.println(nowTime.minusMinutes(1));  //1秒前
        System.out.println(nowTime.minusNanos(1));      //1纳秒前

        System.out.println(nowTime.plusHours(1));  //1小时后
        System.out.println(nowTime.plusMinutes(1));  //1分钟后
        System.out.println(nowTime.plusMinutes(1));  //1秒后
        System.out.println(nowTime.plusNanos(1));      //1纳秒后

        LocalDate Birthday = LocalDate.of(1999,12,02);
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天是我的生日吗？" + nowDate.equals(Birthday)); //比较日期
        System.out.println(Birthday.isAfter(nowDate));  //日期比较前后
        System.out.println(Birthday.isBefore(nowDate));

        //判断俩个日期的某几个属性是否相等
        LocalDate birDate = LocalDate.of(1999,8,1);
        LocalDate nowDate1 = LocalDate.now();
        MonthDay birMd = MonthDay.of(birDate.getMonthValue(),birDate.getDayOfMonth());      //利用月日对象，将生日月日与现在月日比较
        MonthDay nowMd = MonthDay.of(nowDate1.getMonthValue(),nowDate1.getDayOfMonth());

    }
}
