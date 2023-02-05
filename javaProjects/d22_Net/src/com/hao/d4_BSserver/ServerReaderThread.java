package com.hao.d4_BSserver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            /**浏览器已经与本线程建立了Socket管道*/
            /**响应消息给浏览器显示*/
            PrintStream ps = new PrintStream(socket.getOutputStream());
            /**必须响应HTTP协议格式数据，否则浏览器不识别消息*/
            ps.println("HTTP/1.1 200 OK");      //协议类型和版本，响应成功的消息
            ps.println("Content-Type:text/html;charset=UTF-8");     //响应的数据类型：文本网页
            ps.println();   //必须发送一行空行
            /**这样才能响应数据回去给浏览器*/
            ps.println("<span> 显示内容 </span>");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
