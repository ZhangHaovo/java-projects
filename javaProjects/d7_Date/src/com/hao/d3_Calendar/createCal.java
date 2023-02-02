package com.hao.d3_Calendar;

import java.util.Calendar;
import java.util.Date;

/*Calendar:代表了系统此刻时间对应的日历对象
    1.特点：是一个抽象类，不能直接创建对象
 */
public class createCal {
    public static void main(String[] args) {
        //public static Calendar getInstance()      获取当前日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //public int get(int field)     获取日日历某个字段的信息
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int mouth = cal.get(Calendar.MONTH) + 1;        //默认是从0开始计数的
        System.out.println(mouth);
        int day = cal.get(Calendar.DAY_OF_YEAR);        //一年中的第几天
        System.out.println(day);
        //public void set(int field,int value)      修改日历的某个字段信息
        cal.set(Calendar.HOUR,4);      //参数1:修改的字段 参数2：修改的内容
        System.out.println(cal.get(Calendar.HOUR));

        //public void add(int field,int amount)     为某个字段添加、减少指定的值
        cal.add(Calendar.DAY_OF_YEAR,64);       //参数1:修改的字段 参数2：增加的天数
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        //public final Date getTime()       拿到此刻日期对象
        Date d = cal.getTime();
        System.out.println(d);

        //public long getTimeInMillis()     拿到此刻时间毫秒值
        long time = cal.getTimeInMillis();
        System.out.println(time);
    }
}
