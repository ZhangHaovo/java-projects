package com.hao.d5_serializabale;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化：
 *      作用：以内存为基准，把内存中的对象存储到磁盘文件中去，称为对象系列化
 *      注意：对象如果要序列化，必须实现Serializable序列化接口*/
public class d1_ObjectOutputStream {
    public static void main(String[] args) throws Exception{
        /**创建学术对象*/
        Students s = new Students("张三","zhangsan","123456",21);

        /**对象序列化：使用对象字节输出流包装字节输出流管道*/
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d20_File-io\\resources\\Objects.txt"));

        /**直接调用序列化方法*/
        oos.writeObject(oos);

        /**释放资源*/
        oos.close();
    }
}
