package com.hao.d2_UDP.d3_UDP_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
/**UDP的三种通信方式
 - 单播：单台主机与单台主机之间的通信。
 - 广播：当前主机与所在网络中的所有主机通信。
 - 组播：当前主机与选定的一组主机的通信。*/

/**广播
 1.使用广播地址：255.255.255.255
 2.具体方法：
 - 发送端发送的数据包的目的地写的是广播地址、且指定端口。 （255.255.255.255,9999）
 - 本机所在网段的其他主机的程序只要注册对应端口就可以收到消息了。（9999）
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
            /**发送端发送的数据包的目的地写的是广播地址、且指定端口。 （255.255.255.255,9999）*/
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length, InetAddress.getByName("255.255.255.255"),9999);
            socket.send(packet);
        }

    }
}
