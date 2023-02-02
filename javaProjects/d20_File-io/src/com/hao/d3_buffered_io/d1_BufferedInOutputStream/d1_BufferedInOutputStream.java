package com.hao.d3_buffered_io.d1_BufferedInOutputStream;

import java.io.*;

/**缓冲流：也称高效流，高级流
 *      作用：缓冲流自带8kb缓冲区，可以提高原始字节流。字符流读写数据的性能*/
public class d1_BufferedInOutputStream {
    /**
     * BufferedInputSteam/BufferedOutStream:字节缓冲输入/输出流
     * */
    public static void main(String[] args){
        try (

            //1.创建一个字节输入流管道与原文件接通
            InputStream is = new FileInputStream("d20_File-io\\src\\com\\hao\\d2_io\\car.mp4");

            /**把原始的字节输入流包装成高级的缓冲字节输入流*/
            InputStream bis = new BufferedInputStream(is);

            //2.创建一个文件输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\new.mp4");

            /**把字节输出流管道包装成高级的缓冲字节输出流管道*/
            OutputStream bos = new BufferedOutputStream(os);
        ){
            //3.转移数据，定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len;        //记录每次读取的字节数
            while((len = bis.read(buffer)) != -1) {
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成了");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
