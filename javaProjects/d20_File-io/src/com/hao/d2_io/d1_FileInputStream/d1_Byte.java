package com.hao.d2_io.d1_FileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class d1_Byte {
    /**
     * IO流也称输入输出流，就是用来读写数据的
     * I表示input,是数据从硬盘文件读入到内存的过程，称之输入，负责读
     * O表示output，是内存程序的数据从内存到写出到硬盘文件的过程，称之为输出，负责写
     *
     * 按照流的最小单位进行分：1.字节流（InputStream/OutputStream（俩个都是抽象类））:以字节的形式       2.字符流(Reader/Writer（俩个都是抽象类）):以字符的形式
     * 总结：字节流适合做一切文件数据的拷贝，字符流适合做文本文件的操作（读写）
     */


    /**
     * 文件字节输入流（每次读取一个字节）
     *      is.read()
     * 缺点：性能较慢；读取中文字符无法避免乱码的问题
     */
    public static void main(String[] args) throws Exception {
//
//        /**1.创建一个文件字节输入流(管道)与源文件接通*/
////        InputStream is = new FileInputStream(new File("C:\Users\22357\Desktop\zh\JavaProjects\javaProjects\d20_File-io\src\com\hao\d2_io\data.txt"));
        InputStream is = new FileInputStream("d20_File-io\\src\\com\\hao\\d2_io\\data.txt");      //简化
//
//        /**2.读取一个字节返回(读取完成返回-1)*/
//        int b1 =is.read();
//        System.out.println((char)b1);
//
//        int b2 =is.read();
//        System.out.println((char)b2);
//

        /**利用循环改进*/
        int b ;
        while ( (b = is.read()) != -1) {
            System.out.print((char)b);
        }
    }
}
