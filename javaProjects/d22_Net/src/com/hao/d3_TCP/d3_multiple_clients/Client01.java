package com.hao.d3_TCP.d3_multiple_clients;
/**如何才可以让服务端可以处理多个客户端的通信需求:引入多线程。
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

            Socket socket = new Socket("127.0.0.1",7777);       //127.0.0.1为本机

            OutputStream os = socket.getOutputStream();

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
