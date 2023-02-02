package com.hao.d1_Date;

import java.util.Date;

//Data类处理时间，获取时间信息
public class createDate {
    public static void main(String[] args) {
         /*
        Date类记录时间毫秒值的2种形式
        1.创建一个Date类的对象：代表系统此刻日期时间对象
         */
        Date date = new Date();
        System.out.println(date);
        /*
        2.时间毫秒值
        从1970年1月1日到此刻总的毫秒数
         */
        long time = date.getTime();        //或者 long time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println("--------------------------------");


        //案例：计算出当前时间往后走1小时121秒之后的时间是多少
        Date date1 = new Date();
        System.out.println(date1);

        long time1 = System.currentTimeMillis();
        time1 += (60 * 60 + 121) * 1000;

        //public Date(long time)        （有参构造器）将时间毫秒值转换成Date日期对象
        Date date2 = new Date(time1);
        System.out.println(date2);
        System.out.println("---------------------------------");

        //public void setTime(long time)        设置当前对象的时间为当前时间毫秒值对应的时间
        Date date3 = new Date();
        long time3 = 1;
        date3.setTime(time3);
        System.out.println(date3);
    }
}
