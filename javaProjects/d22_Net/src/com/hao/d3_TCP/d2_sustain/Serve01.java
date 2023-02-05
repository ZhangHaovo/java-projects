package com.hao.d3_TCP.d2_sustain;


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
            /**注册端口
             * public ServerSocket(int port) 注册服务端端口*/
            ServerSocket serverSocket = new ServerSocket(7777);

            /**等待接收客户端的Socket
             public Socket accept() 连接成功返回Socket对象与客户端建立端到端通信*/

            Socket socket = serverSocket.accept();

            /**从socket管道中得到一个字节输入流*/
            InputStream is = socket.getInputStream();

            /**将字节输入流包装成字符缓冲输入流进行消息的接收*/
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            /**按行读取消息*/
            String msg;
            while ((msg = br.readLine())!= null){
                System.out.println(socket.getRemoteSocketAddress() + "说了：" + msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
