package com.hao.d2_io.d1_FileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class d2_ByteArray {
    public static void main(String[] args) throws Exception{
        /**
         * 文件字节输入流：（每次读取一个字节数组）
         *      is.read(buffer)
         *  优点：适合做文件的拷贝
         *  缺点：性能比每次读取一个字节好，但是依旧无法解决中文乱码的问题
         */

        //1.创建一个文件字节输入流管道与源文件联通
        InputStream is = new FileInputStream("d20_File-io\\src\\com\\hao\\d2_io\\data1.txt");

//        //2.定义一个字节数组，用于读取字节数组
//        byte[] buffer = new byte[3];     //byte[1024]为1kb
//        int len = is.read(buffer);      //返回每次读取了多少个字节,读取完毕返回-1
//        System.out.println("读取了" + len + "个字节");
//        String rs = new String(buffer);     //将字节数组装换成字符串
//        System.out.println(rs);
//
//        int len1 = is.read(buffer);
//        System.out.println("读取了" + len1 + "个字节");
//        String rs1 = new String(buffer);
//        System.out.println(rs1);
//
//        int len2 = is.read(buffer);     //字节数组为3字节，只读取了2个字节，剩下一个为上一次读取时残留数据，解决方案：30行
//        System.out.println("读取了" + len2 + "个字节");
//        String rs2 = new String(buffer,0,len2);        //改进：读取多少，输出多少
//        System.out.println(rs2);
//
//        int len3 = is.read(buffer);
//        System.out.println(len3);       //读取完毕返回-1

        //改进：使用循环
        byte[] buffer = new byte[3];
        int len ;
        while((len = is.read(buffer)) != -1) {
            System.out.print(new String(buffer,0,len));
        }
    }
}
