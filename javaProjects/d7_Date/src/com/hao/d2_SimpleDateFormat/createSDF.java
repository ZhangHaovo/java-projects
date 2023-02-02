package com.hao.d2_SimpleDateFormat;

import java.text.ParseException;
import java.util.Date;

//SimpleDateFormat将时间转换成想要的形式，格式化时间、解析时间
public class createSDF {
    public static void main(String[] args) throws ParseException {
        //日期对象
        Date d = new Date();
        System.out.println(d);

        //格式化这个日期对象(指定格式化的形式)
        //2020-11-11 13：21：03 --- yyyy-MM-dd HH-mm-ss
        //2020年11月11日 13：21：03 --- yyyy年MM月dd日 HH-mm-ss
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH-mm-ss EEE a");      //EEE取星期几 a取上午还是下午

        //格式化日期对象为喜欢的字符串形式
        //public final String format(Date date)    将日期格式化为日期/时间字符串
        //public final String format(Object time)  将时间毫秒值格式化为日期/时间字符串
        String rs = sdf.format(d);
        System.out.println(rs);

        //simpleDateFormat 解析字符串时间成为日期对象（形式必须和被解析时间的形式完全一致，否则会解析报错）
        //public Date parse(String source)  给指定字符串的开始解析文本生成日期
        //案例：将"2021年08月06日 11：11：11"解析成日期对象
        String dateStr = "2021年08月06日 11:11:11";
        java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = sdf1.parse(dateStr);
        System.out.println(d1);
    }
}
