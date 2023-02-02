package com.hao.d3_buffered_io.d2_BufferedReaderWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/**
 * BufferedWriter:字符缓冲输出流
 *      作用:提高字符输出流写数据的性能，除此之外多了换行功能
 */
public class d2_BufferedWriter {
    public static void main(String[] args) throws Exception{
        //1.创建一个字符输出流管道与目标文件接通*/
        Writer fw = new FileWriter("d20_File-io\\src\\com\\hao\\d2_io\\out2.txt");  //覆盖管道，每次启动都会清空文件之前的数据

        /**把低级的字符输出流包装成高级的缓冲字符输出流*/
        BufferedWriter bw = new BufferedWriter(fw);

        //写一个字符出去
        bw.write('张');
        bw.write(98);
        bw.write('a');

        /**BufferedWriter独有功能：newline()*/
        bw.newLine();

        //写一个字符串出去
        bw.write("你好");

        //写一个字符数组出去
        char[] chars = "你好".toCharArray();
        bw.write(chars);

        //写字符串的一部分出去
        bw.write("我是中国人",0,3);

        //写字符数组的一部分出去
        //bw.write(chars,0,3);

        //bw.flush();     //刷新后流可以继续使用
        bw.close();     //关闭包含刷新，关闭后流不可以使用
    }
}
