package com.hao.d6_print;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**打印流：可以实现方便、高效的打印数据到文件中去。一般指PrintStream和PrintWrite*/
public class d1_PrintStream {
    /**PrintStream*/
    public static void main(String[] args) throws Exception{
        /**创建一个打印流对象*/
//        PrintStream ps = new PrintStream(new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\out2.txt"));        //若想覆盖输出文件，则在低级流上追加true
        PrintStream ps = new PrintStream("d20_File-io\\src\\com\\hao\\d2_io\\PSout.txt");

        /**调用功能*/
        ps.println(97);
        ps.println('a');
        ps.println(true);
        ps.close();
    }
}
