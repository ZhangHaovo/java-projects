package com.hao.d8_commons_io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**commons-io是一组有关io操作的类库，可以提高IO功能开发的效率，提供很多IO操作的类，最常见的是FileUtils,IOUtils
 *      FileUtils主要方法有readFileToString,copyFile,copyDirectoryToDirectory*/
public class Demo {
    public static void main(String[] args) throws Exception{
        /**文件复制*/
//        IOUtils.copy(new FileInputStream("d20_File-io\\resources\\data.txt"),new FileOutputStream("d20_File-io\\resources\\dataCopy.txt"));

        /**文件复制到文件夹*/
//        FileUtils.copyFileToDirectory(new File("d20_File-io\\resources\\data.txt"),new File("d20_File-io\\resources\\newDir"));

        /**文件夹拷贝到文件夹*/
//        FileUtils.copyDirectoryToDirectory(new File("d20_File-io\\resources\\aaa"),new File("d20_File-io\\resources\\newDir"));

        /**删除操作*/
//        FileUtils.deleteDirectory(new File("d20_File-io\\resources\\newDir\\aaa"));

        /**JDK1.7开始 java自己做了一些一行代码完成复制的操作：NewIO的技术*/
//        Files.copy(Path.of("d20_File-io\\resources\\data.txt"),Path.of("d20_File-io\\resources\\dataCopy.txt"));

        /**NewIO的删除操作*/
//        Files.deleteIfExists(Path.of("d20_File-io\\resources\\newDir\\aaa"));
    }
}
