package com.hao.d2_exception.d3_exception_handle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d3_Exception_TryCatch {
    public static void main(String[] args) {
        //异常处理方式2：try...catch:监视捕获异常，用在方法内部，可以将方法内部出现的异常直接捕获处理(这种方法还可以，发生异常的方法自己可以独立完成异常的处理，程序可以继续往下执行)
        parseTime("2022-10-30 10:23:32");

    }

    public static void parseTime(String date){        //方法抛异常
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            InputStream is = new FileInputStream("E:/123.jpg");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //将try...catch方法写在一起
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//            InputStream is = new FileInputStream("E:/123.jpg");
//        } catch (ParseException e) {
//            e.printStackTrace();        //打印异常栈信息
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //将catch方法统一处理
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);
            InputStream is = new FileInputStream("E:/123.jpg");
        } catch (Exception e) {
            e.printStackTrace();        //打印异常栈信息
        }
    }
}
