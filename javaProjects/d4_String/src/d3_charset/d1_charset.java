package d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class d1_charset {
    public static void main(String[] args) throws Exception {

        /**所有编码英文占1个字节，GBK编码下中文为2个字节，uft-8下中文为3个字节*/

        /**进行文字的编码和解码*/

        /**1.将文字转换成字节（使用指定的编码）
         * getbBytes函数，返回字节数组*/
        String name = "abc一二三";
        byte[] bytes = name.getBytes("GBK");     //代码默认以当前字符集进行编码，可以指定编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        /**2.解码：把字节转换成对应的中文形式（编码前和编码后的字符集必须一致，否则乱码）
         * String(Byte[] bytes) 利用构造器，默认字符集来解码
         * String(byte[] bytes, String charseName)  指定字符集来解码*/
//        String rs = new String(bytes);    //默认uft-8(系统)
        String rs = new String(bytes,"GBK");
        System.out.println(rs);
    }

}
