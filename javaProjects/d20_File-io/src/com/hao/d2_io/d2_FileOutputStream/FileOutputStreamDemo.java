package com.hao.d2_io.d2_FileOutputStream;

import java.io.OutputStream;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    /**
     * 文件字节输出流
     */
    public static void main(String[] args) throws Exception{
        /**1.创建一个文件字节输出流管道与目标文件接通 */
//        OutputStream os = new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\out.txt");       //先清空之前的数据，写新数据进入
        OutputStream os = new FileOutputStream("d20_File-io\\src\\com\\hao\\d2_io\\out.txt",true);       //追加管道，每次运行在末尾追加字符

        /**2.写数据出去 */

        /** 写一个字节出去 write(int a)*/
        os.write('a');
        os.write(98);
//        os.write('爱');      //写一个字节会导致中文乱码

        /**写一个字节数组出去 write(byte[] buffer)*/
        byte[] buffer = {'a',97,98,99};
        os.write(buffer);
        byte[] buffer1 = "我是中国人".getBytes();        //中文需要编码为字节数组
        os.write(buffer1);
        //换行：\r\n为了兼容linux系统
        os.write("\r\n".getBytes());

        /**写一个字节数组的一部分*/
        byte[] buffer2 = {'a',97,98,99};        //规定输出个数
        os.write(buffer2,0,2);

        /**刷新数据，写数据必须刷新数据*/
//        os.flush();
        //释放资源，包含了刷新，关闭后流将不可以使用
        os.close();
    }
}
