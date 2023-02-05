package com.hao.d3_TCP.d1_simple;
/**TCP通信-快速入门
 - 创建客户端的Socket对象，请求与服务端的连接。
 - 使用socket对象调用getOutputStream()方法得到字节输出流。
 - 使用字节输出流完成数据的发送。
 - 释放资源：关闭socket管道。
 */

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
/**客户端*/
public class Client01 {
    public static void main(String[] args){
        try {
            System.out.println("==客户端启动成功==");
            /**创建Socket通信管道请求有服务端的连接
             * public Socket(String host , int port) 创建发送端的Socket对象与服务端连接，参数为服务端程序的ip和端口。*/
            Socket socket = new Socket("127.0.0.1",7777);       //127.0.0.1为本机

            /**从socket通信管道中得到一个字节输出流，负责发送数据
             * OutputStream getOutputStream() 获得字节输出流对象*/
            OutputStream os = socket.getOutputStream();

            /**把低级的字节流包装成打印流*/
            PrintStream ps = new PrintStream(os);

            /**发送消息*/
            ps.println("我是TCP客户端，我已经和你对接，是否进行连接？");
            ps.flush();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
