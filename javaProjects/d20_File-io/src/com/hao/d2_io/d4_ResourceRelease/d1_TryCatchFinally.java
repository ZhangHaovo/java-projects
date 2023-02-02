package com.hao.d2_io.d4_ResourceRelease;

import java.io.*;

/**资源释放*/

public class d1_TryCatchFinally {
    /**
     * try-catch-finally
     * finally:在异常处理时提供finally块来执行所有清除操作，比如说io流中的释放资源
     * 特点：任何情况finally控制的语句最终一定会执行，除非JVM退出（优先级比return高）
     */
    public static void main(String[] args) {

        InputStream is = null;
        OutputStream os = null;

        try {
            //1.创建一个字节输入流管道与原文件接通
            is = new FileInputStream("d20_File-io\\src\\com\\hao\\d2_io\\car.mp4");
            //2.创建一个文件输出流管道与目标文件接通
            os = new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\new.mp4");
            //3.转移数据，定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len;        //记录每次读取的字节数
            while((len = is.read(buffer)) != -1) {
                os.write(buffer,0,len);
            }
            System.out.println("复制完成了");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            /**
             * 无论代码是正常结束还是异常，都要在最后执行这里
             * 注意:不建议在这里加return.如果加了，由于这里return优先级较高，会打印这里的return
             */
            System.out.println("===========finally===========");
            //4.关闭流
            try {
                if(os != null)      //若异常发生在流被赋值前，会出现空指针异常
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
