package com.hao.d1_file;

import java.io.File;
import java.util.Arrays;

public class d3_File_traversal {
    public static void main(String[] args) {
        /**文件的遍历*/
        File file =new File("d14_File-io/resources");

        /**.list获取当前目录下所有的一级目录名称到一个数组中去*/
        String[] names = file.list();
        System.out.println(Arrays.toString(names));

        /**.listFiles获取当前目录下所有的一级目录名称到一个对象数组中去
         *      注意事项：当调用者（目录）不存在的时候。返回的是null
         *              当调用者是一个文件时(必须包含一级目录)，返回null
         *              当调用者是一个空文件夹时，返回的一个长度为0的数组
         *              当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包括隐藏内容*/
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsoluteFile());
        }
    }
}
