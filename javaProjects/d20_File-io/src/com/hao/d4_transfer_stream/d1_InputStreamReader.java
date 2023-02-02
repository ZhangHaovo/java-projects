package com.hao.d4_transfer_stream;

import java.io.*;

/**
 * 转换流：解决不同编码读取乱码的问题*/

/**字符输入转换流：输入文件编码不同
 *      流程：①使用字符输入转换流，可以提取文件的原始字节流，原始字节流不会乱码②然后将字节流以指定编码转换成字符输入流，这样字符输入流中的字符就不会乱码了*/

public class d1_InputStreamReader {
    /**代码UFT-8，而读取文件是GBK*/
    public static void main(String[] args) {
        try {
            /**提取GBK文件的原始字节流*/
            InputStream is = new FileInputStream("d20_File-io\\resources\\GBKdata.txt");

            /**把原始字节流转换成字符输入流*/
            Reader isr = new InputStreamReader(is,"GBK");     //以指定的GBK编码转换成字符输入了

            BufferedReader br = new BufferedReader(isr);    //包装成字符缓冲输入流

            String line ;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
