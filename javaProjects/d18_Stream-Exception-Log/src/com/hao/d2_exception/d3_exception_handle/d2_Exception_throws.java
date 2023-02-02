package com.hao.d2_exception.d3_exception_handle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d2_Exception_throws {
//    public static void main(String[] args) throws ParseException, FileNotFoundException {       //主函数也要抛异常，虽然有多个异常，但是最终抛出去的只有一个（看谁先出现）
    public static void main(String[] args) throws Exception {           //（规范写法：throws Exception）

        //异常处理方法1：throws:用在方法上，可以将方法内部出现的异常抛出去给本方法的调用者处理（这种方法并不好，发生异常的方法自己并不处理异常，如果异常最终抛出去给虚拟机将引起程序死亡）
        System.out.println("程序开始");
        parseTime("2022-10-30 10:23:32");
        System.out.println("程序结束");

    }

    public static void parseTime(String date) throws Exception {        //方法抛异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

        InputStream is = new FileInputStream("E:/123.jpg");
    }
}
