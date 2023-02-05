package com.hao.d3_TCP.d2_sustain;
/**使用TCP通信方式实现：多发多收消息。
 - 可以使用死循环控制服务端收完消息继续等待接收下一个消息。
 - 客户端也可以使用死循环等待用户不断输入消息。
 - 客户端一旦输入了exit，则关闭客户端程序，并释放资源。
 由于服务端只有一个线程，所以只能接收一个客户端的消息
 */

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

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

            Scanner sc = new Scanner(System.in);
            while(true) {
                System.out.println("请说");
                String msg = sc.nextLine();
                ps.println(msg);
                ps.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
