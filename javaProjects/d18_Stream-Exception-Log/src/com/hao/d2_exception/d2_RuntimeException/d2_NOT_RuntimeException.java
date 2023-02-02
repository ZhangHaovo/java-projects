package com.hao.d2_exception.d2_RuntimeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d2_NOT_RuntimeException {
    public static void main(String[] args) throws ParseException {
        //不是RuntimeException或者其子类的异常，编译阶段就报错，必须处理，否则代码不通过
        String date = "2022-10-30 10:23:32";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

    }
}
