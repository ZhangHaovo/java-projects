package com.hao.d3_TCP.d5_instant;
/**即时通信
 * - 即时通信，是指一个客户端的消息发出去，其他客户端可以接收到。
 * - 之前我们的消息都是发给服务端的。
 * - 即时通信需要进行端口转发的设计思想。
 */

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**客户端*/
public class Client01 {
    public static void main(String[] args) throws Exception{

        System.out.println("==客户端启动成功==");

        Socket socket = new Socket("127.0.0.1",7777);       //127.0.0.1为本机

        /**创建一个独立的线程专门负责这个客户端的度消息（服务端随时转发消息过来）*/
        new ClientReaderThread(socket).start();

        OutputStream os = socket.getOutputStream();

        PrintStream ps = new PrintStream(os);

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请说");
            String msg = sc.nextLine();
            ps.println(msg);
            ps.flush();
        }

    }

}
