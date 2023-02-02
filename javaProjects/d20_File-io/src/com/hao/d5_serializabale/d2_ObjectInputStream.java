package com.hao.d5_serializabale;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**对象反序列化：以内存为基准，把存储到磁盘文件中去的对象数据恢复成内存中的对象，称为对象反序列化
 *      tips:①用transient修饰的变量不参与序列化
 *           ②可申明序列化的版本号:serialVersionUID(序列化的版本号必须和反序列化的版本号必须一致才不会出错)*/
public class d2_ObjectInputStream {
    public static void main(String[] args) throws Exception{
        /**创建对象字节输入流管道包装低级的字节输入流管道*/
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("d20_File-io\\resources\\Objects.txt"));

        /**直接调用字节输入流的反序列化方法*/
        Students s = (Students) is.readObject();

        System.out.println(s);
    }
}
