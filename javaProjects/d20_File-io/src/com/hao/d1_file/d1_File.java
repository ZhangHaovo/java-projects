package com.hao.d1_file;

import java.io.File;

public class d1_File {
    public static void main(String[] args) {
        /**
         * 1.先要定位文件
         *      File类可以定位文件：进行删除、获取文本本身信息等操作，但是不能读写文件内容
         * 2.读写文件数据
         *      IO流技术可以对硬盘中的文件进行读写
         */

        /**
         * File类的概述
         *      代表着操作系统的文件对象（文件、文件夹）
         *      提供了定位文件，获取文件本身信息、删除文件、创建文件（文件夹）等功能
         */


        /**创建File对象(指定了文件的路径)*/
        /*路径写法：1.E:/Projects/JavaProjects/javasepromax/d14_FIle-io\resources
                  2.E:\\Projects\\JavaProjects\\javasepromax\\d14_FIle-io\\resources
                  3.斜杠的地方使用File.separator分开*/
        File file = new File("E:/Projects/JavaProjects/javasepromax/d14_File-io/resources/cat.jpg");       //俩个反斜杠是防止文件名以n开头解析成换行
        long size = file.length();      //拿到文件的字符大小
        System.out.println(size);

        /** File创建对象，支持绝对路径 支持相对路径*/
        //绝对路径
        File file1 = new File("E:\\Projects\\JavaProjects\\javasepromax\\d14_File-io\\resources\\picture.jpg");
        System.out.println(file1.length());
        //相对路径(相对于工程下)
        File file2 = new File("d14_File-io/resources/data.txt");
        System.out.println(file2.length());

        /**File创建对象，可以是文件也可以是文件夹*/
        File file3 = new File("E:\\Projects\\JavaProjects");
        //判断这个路径是否存在
        System.out.println(file3.exists());     //文件夹一般不拿大小，因为有些文件夹没有大小或者很小，没有意义
    }
}
