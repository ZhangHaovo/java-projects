package com.hao.d2_exception.d3_exception_handle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d4_Exception_combine {
    public static void main(String[] args) {
        //异常处理方式3：前俩者的结合（理论上是最好的方法，底层的异常抛出去给最外层，最外层集中捕获处理，第二种方法中底层try...catch直接将异常处理了）
        /**
         * 方法直接将异常通过throws抛出去给调用者
         * 调用者收到异常后直接捕获处理
         */

        System.out.println("程序开始");
        try {
            parseTime("2022-10-30 10:23:32");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束");

    }

    public static void parseTime(String date) throws Exception {        //异常抛给调用者
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

        InputStream is = new FileInputStream("E:/123.jpg");
    }
}
