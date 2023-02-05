package com.hao.d2_UDP.d2_sustain;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
/**使用UDP通信实现：多发多收消息
 发送端可以一直发送消息。
 接收端可以不断的接收多个发送端的消息展示。
 发送端输入了exit则结束发送端程序。*/
/**发送端(客户端)*/
public class Client01 {
    public static void main(String[] args) throws Exception{
        System.out.println("=========客户端启动==========");

        DatagramSocket socket = new DatagramSocket();


        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请发送：");
            String msg = sc.nextLine();

            if ("exit".equals(msg)){
                socket.close();
                break;
            }
            byte[] buffer = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length, InetAddress.getLocalHost(),8888);
            socket.send(packet);
        }

    }
}
