package com.hao.d6_print;

import java.io.PrintWriter;

public class d2_PrintWriter {
    /**PrintWrite*/
    public static void main(String[] args) throws Exception {
        /**创建一个打印流对象*/
//        PrintStream ps = new PrintStream(new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\out2.txt"));
        PrintWriter pw = new PrintWriter("d20_File-io\\src\\com\\hao\\d2_io\\PWout.txt");

        /**调用功能*/
        pw.println(97);
        pw.println('a');
        pw.println(true);

        pw.write("你好");     //PrintWriter支持写操作

        pw.close();
    }
}
