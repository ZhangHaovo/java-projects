package com.hao.d2_UDP.d4_UDP_multicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
/**UDP如何实现组播
 1.使用组播地址：224.0.0.0 ~ 239.255.255.255
 2.具体方法：
 - 发送端的数据包的目的地是组播IP  (例如：224.0.1.1,  端口：9999)
 - 接收端必须绑定该组播IP(224.0.1.1)，端口还要注册发送端的目的端口9999 ，这样即可接收该组播消息。
 - DatagramSocket的子类MulticastSocket可以在接收端绑定组播IP。

 */
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
            /**发送端的数据包的目的地是组播IP  (例如：224.0.1.1,  端口：9999)*/
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length, InetAddress.getByName("224.0.1.1"),9999);
            socket.send(packet);
        }

    }
}
