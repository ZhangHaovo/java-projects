package com.hao.d3_TCP.d5_instant;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**客户端*/
public class Serve01 {
    /**定义一个静态的List集合存储当前全部在线的socket管道*/
    public static List<Socket> allOnlineSockets = new ArrayList<>();

    public static void main(String[] args) throws Exception{

        System.out.println("==服务端启动成功==");

        ServerSocket serverSocket = new ServerSocket(7777);

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + "上线了");
            /**上线将socket添加入队列*/
            allOnlineSockets.add(socket);
            new ServerReaderThread(socket).start();
        }
    }
}
