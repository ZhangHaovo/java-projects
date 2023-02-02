package com.hao.d2_io.d5_FIleReader;

import java.io.FileReader;
import java.io.Reader;

/**
 * 文件字符输入流：Reader,将数据以字符的方式读取到内存中去
 *
 * 次读取一个字符
 */
public class d1_Char {
    public static void main(String[] args) throws Exception {
        /** 创建一个字符输入流管道与源文件接通*/
        Reader fr = new FileReader("d20_File-io\\src\\com\\hao\\d2_io\\data2.txt");

        /** 读取一个字符的编号返回，没有可读的字符返回-1*/
//        int code = fr.read();
//        System.out.println((char)code);

        //利用循环改进
        int code ;
        while((code = fr.read()) != -1){
            System.out.print((char) code);
        }
    }
}
