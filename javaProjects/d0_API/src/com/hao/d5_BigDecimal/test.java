package com.hao.d5_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

//BigDecimal:用于解决浮点型运算精度失真的问题
public class test {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println( a + b );        //出现精度误差

        //创建对象BigDecimal封装浮点类型的数据（最好的方式是调用方法）
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(a1.add(b1));             //加法
        System.out.println(a1.subtract(b1));        //减法
        System.out.println(a1.multiply(b1));        //乘法
        System.out.println(a1.divide(b1));          //除法

        //将最终结果转换成double类型
        double rs = c1.doubleValue();
        System.out.println(rs);

        //注意：BigDecimal是一定要做精度运算的
        BigDecimal aa = BigDecimal.valueOf(10.0);
        BigDecimal bb = BigDecimal.valueOf(3.0);
        //BigDecimal cc = aa.divide(bb);      //报错，由于BigDecimal必须要做精度运算,而10/3无法做法
        BigDecimal cc = aa.divide(bb,2, RoundingMode.HALF_UP);      //(参数1：除数   参数2：保留2位小数   参数3：舍入模式（案例中为向上取整）)
        System.out.println(cc);

    }
}
