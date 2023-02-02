package com.hao.d2_io.d6_FIleWriter;

import java.io.FileWriter;
import java.io.Writer;

/**字符文件输出流*/
public class d1_FileWriter {
    public static void main(String[] args) throws Exception{
        /**1.创建一个字符输出流管道与目标文件接通*/
        Writer fw = new FileWriter("d20_File-io\\src\\com\\hao\\d2_io\\out1.txt");  //覆盖管道，每次启动都会清空文件之前的数据

        //写一个字符出去
        fw.write('张');
        fw.write(98);
        fw.write('a');

        //写一个字符串出去
        fw.write("你好");

        //写一个字符数组出去
        char[] chars = "你好".toCharArray();
        fw.write(chars);

        //写字符串的一部分出去
        fw.write("我是中国人",0,3);

        //写字符数组的一部分出去
        //fw.write(chars,0,3);

        //fw.flush();     //刷新后流可以继续使用
        fw.close();     //关闭包含刷新，关闭后流不可以使用
    }
}
