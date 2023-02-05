package com.hao.d3_TCP.d3_multiple_clients;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**客户端*/
public class Serve01 {
    public static void main(String[] args) {
        try {
            System.out.println("==服务端启动成功==");

            ServerSocket serverSocket = new ServerSocket(7777);

            /**定义死循环由主线程负责不断地接收客户端的socket*/
            while (true) {
                /**每接收一个客户端的Socket管道，就交给一个独立的子线程负责读取消息*/
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                /**开始创建独立线程处理Socket*/
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
