package com.hao.d4_transfer_stream;

import java.io.*;

/**
 * 字符输出转换流：输出文件编码不同
 */
public class d2_OutputStreamWriter {
    public static void main(String[] args) throws Exception{
        /**定义一个字节输出流*/
        OutputStream os = new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\outGBK.txt");

        /**把原始的字节输出流转换成字符输出流*/
        Writer osw = new OutputStreamWriter(os,"GBK");      //输出编码为GBK的文件

        BufferedWriter bw = new BufferedWriter(osw);        //包装成高级的缓冲字符输出流

        bw.write("合肥IKUN");
        bw.newLine();
        bw.write("合肥IKUN");
        bw.write("合肥IKUN");

        bw.close();
    }
}
