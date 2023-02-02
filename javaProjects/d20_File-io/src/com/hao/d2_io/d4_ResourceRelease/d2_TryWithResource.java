package com.hao.d2_io.d4_ResourceRelease;

import java.io.*;

public class d2_TryWithResource {
    /**
     * jdk7开始改进方案：try(定义流对象){} catch{}
     * jdk9开始改进方案：定义输入输出流对象 try(输入输出流对象){} catch{}
     */
    public static void main(String[] args) throws Exception{

        try (
                /**
                 * jdk7开始
                 * 只能放置资源对象，用完会自动关闭，自动调用资源对象的close方法关闭资源（即使出现异常也会做关闭操作）
                 * 资源：实现autoCloseable接口的类
                 */
                InputStream is = new FileInputStream("d20_File-io\\src\\com\\hao\\d2_io\\car.mp4");
                OutputStream os = new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\new.mp4");
                ){

        /**
         * jdk9开始(不太推荐)
         */
//        InputStream is = null;
//        OutputStream os = null;
//        try(is;os){


            byte[] buffer = new byte[1024];
            int len;        //记录每次读取的字节数
            while((len = is.read(buffer)) != -1) {
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
