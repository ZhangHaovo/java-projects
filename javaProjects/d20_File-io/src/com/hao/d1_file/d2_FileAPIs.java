package com.hao.d1_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class d2_FileAPIs {
    public static void main(String[] args) throws IOException {
        /**file类常用的一些API*/
        //用相对路径创建一个文件对象
        File file =  new File("d14_File-io/resources/cat.jpg");

        /**获取它的绝对路径*/
        System.out.println(file.getAbsoluteFile());

        /**获取文件定义的时候使用的路径*/
        System.out.println(file.getPath());

        /**获取文件的名称：带后缀*/
        System.out.println(file.getName());

        /**获取文件的大小：字节个数*/
        System.out.println(file.length());

        /**获取文件最后的修改时间*/
        long time = file.lastModified();
        System.out.println("最后修改的时间:" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

        /**判断文件对象是文件还是文件夹*/
        System.out.println(file.isFile());      //是否是文件
        System.out.println(file.isDirectory()); //是否是文件夹
        System.out.println("---------------------------");

        /**File类创建文件*/
        /**创建新文件，创建成功返回true(几乎不用，以后写文件写出去的时候会自动创建)*/
        File file1 = new File("d14_File-io/resources/data1.txt");
        System.out.println(file1.createNewFile());
        /**mkdir创建一级目录*/
        File file2 = new File("d14_File-io/resources/newDir");
        System.out.println(file2.mkdir());
        /**mkdirs创建多级目录*/
        File file3 = new File("d14_File-io/resources/aaa/bbb/ccc");
        System.out.println(file3.mkdirs());

        /**File类删除文件*/
        //delete方法直接删除不走回收站,文件被占用时依旧可以被删除
        System.out.println(file1.delete());
        //delete方法默认只能删除空文件夹,不能删除非空的文件夹
        System.out.println(file3.delete());     //多级空目录删除最后一级目录
    }
}
