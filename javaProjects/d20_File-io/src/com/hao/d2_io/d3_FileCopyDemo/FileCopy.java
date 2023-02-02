package com.hao.d2_io.d3_FileCopyDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 利用字节流完成文件的复制（支持一切文件的复制）
 */
public class FileCopy {
    public static void main(String[] args){
        try {

            //1.创建一个字节输入流管道与原文件接通
            InputStream is = new FileInputStream("d20_File-io\\src\\com\\hao\\d2_io\\car.mp4");
            //2.创建一个文件输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\new.mp4");
            //3.转移数据，定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len;        //记录每次读取的字节数
            while((len = is.read(buffer)) != -1) {
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了");
            //4.关闭流
            os.close();
            is.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
