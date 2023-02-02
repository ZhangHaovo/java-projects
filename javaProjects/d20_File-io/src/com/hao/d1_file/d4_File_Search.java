package com.hao.d1_file;

import java.io.File;

public class d4_File_Search {
    public static void main(String[] args) {
        //文件搜索，从C:盘中，搜索出某个文件名称并输出绝对路径
        //先定位出的应该是一级文件对象
        //遍历全部一级文件对象，判断是否是文件
        //如果是文件，判断是否是自己想要的
        //如果是文件夹，需要继续递归进去重复上述过程

        //需求：在F盘下寻找PxCook.exe文件

        serchFile(new File("F:/"),"PxCook.exe");
    }

    //搜索某个目录下的全部文件，找到我们想要的文件
    public static void serchFile(File dir, String fileName){        //dir 被搜索的源目录 ； fileName 被搜索的文件名称
        //判断dir是否是目录
        if (dir != null && dir.isDirectory()){      //存在dir且dir是一个文件夹
            File[] files = dir.listFiles();
            if (files != null && files.length > 0){     //判断是否存在一级文件对象，才可以遍历
                for (File file : files) {
                    if (file.isFile()) {         //判断当前file是文件还是文件夹
                        if (file.getName().contains(fileName)) {      //file是文件的话，输出绝对路径
                            System.out.println("Find it! " + file.getAbsoluteFile());

                        }
                    } else {
                            serchFile(file, "PxCook.exe");       //file是文件夹的话，递归地调用searchFile函数
                    }
                }
            }
        }else {
            System.out.println("当前搜索不是文件夹或者文件夹为空");
        }
    }
}
