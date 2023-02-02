package com.hao.d2_io.d1_FileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

public class d3_TotalByte{
    /**
     * 文件字节输入流：（一次读取全部文件）：定义一个与文件一样大的字节数组，一次性读取完全部字节
     *
     * 缺点：可以解决中文乱码的问题，但是文件过大的时候会引起内存溢出
     */
    public static void main(String[] args) throws Exception{
        //1.创建一个文件字节输入流管道与源文件联通
        File f = new File("d20_File-io\\src\\com\\hao\\d2_io\\data2.txt");
        InputStream is = new FileInputStream(f);

        //2.定义一个字节数组与源文件的大小一样
        byte[] buffer = new byte[(int)f.length()];      //f.length 类型为long
        int len = is.read(buffer);
        System.out.println("读取了" + len + "个字节");
        System.out.println("文件大小" + f.length());
        System.out.println(new String(buffer));

        //jdk9开始提供读取全部字节数组
//        byte[] buffer = is.readAllBytes();
//        System.out.println(new String(buffer));
    }
}
