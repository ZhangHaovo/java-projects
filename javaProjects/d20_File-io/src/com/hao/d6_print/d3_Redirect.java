package com.hao.d6_print;

import java.io.PrintStream;

/**了解改变输出语句的位置到文件*/
public class d3_Redirect {
    public static void main(String[] args) throws Exception{
        System.out.println("默认打印在打印台上");
        System.out.println("out其实是一个PrintStream打印流对象");

        /**改变输出语句的位置(重定向)*/
        PrintStream ps = new PrintStream("d20_File-io\\src\\com\\hao\\d2_io\\log.txt");
        /**将系统打印流改成自己定义的打印流*/
        System.setOut(ps);

        System.out.println("现在将数据打印在了文件中");
    }
}
