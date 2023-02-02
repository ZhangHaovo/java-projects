package com.hao.d3_buffered_io.d2_BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * BufferedReader:字符缓冲输入流
 *      作用:提高字符输入流读取数据的性能，除此之外多了按照行读取数据的功能
 */
public class d1_BufferedReader {
    public static void main(String[] args){

        try(
                Reader fr = new FileReader("d20_File-io\\src\\com\\hao\\d2_io\\data2.txt");
                /**把低级的字符输入流包装成高级的缓冲字符输入流*/
                BufferedReader br = new BufferedReader(fr);     //readLine是BufferedReader独有的方法，不能用多态
        ){
//            char[] buffer = new char[1024]; //1k字符
//            int len; //记录每次输出多少字符，避免打多
//            while((len = br.read(buffer)) != -1) {
//                String rs = new String(buffer, 0, len);
//                System.out.println(rs);
//            }
            /**按照行读取数据的功能（推荐）*/
            String line ;
            while ((line = br.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
