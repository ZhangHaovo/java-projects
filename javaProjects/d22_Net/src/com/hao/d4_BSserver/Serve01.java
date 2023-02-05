package com.hao.d4_BSserver;


import java.net.ServerSocket;
import java.net.Socket;

/**客户端*/
public class Serve01 {
    public static void main(String[] args) {
        try {
            /**注册端口*/
            ServerSocket serverSocket = new ServerSocket(7777);
            /**创建一个循环接受多个客户端的请求*/
            while (true) {
                Socket socket = serverSocket.accept();
                /**交给一个独立的线程来处理*/
                new ServerReaderThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
