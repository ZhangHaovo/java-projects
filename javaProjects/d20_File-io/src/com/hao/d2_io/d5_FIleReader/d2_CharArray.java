package com.hao.d2_io.d5_FIleReader;

import java.io.FileReader;
import java.io.Reader;

/**一次读取一个字符数组*/
public class d2_CharArray {
    public static void main(String[] args) throws Exception{
        /** 创建一个字符输入流管道与源文件接通*/
        Reader fr = new FileReader("d20_File-io\\src\\com\\hao\\d2_io\\data2.txt");

        /**用循环每次读取一个字符数组的数据*/
        char[] buffer = new char[1024]; //1k字符
        int len; //记录每次输出多少字符，避免打多
        while((len = fr.read(buffer)) != -1){
            String rs = new String(buffer,0,len);
            System.out.println(rs);
        }

    }
}
