package com.hao.d2_UDP.d4_UDP_multicast;

import java.net.*;

/**接收端(服务端)*/
public class Server02 {
    public static void main(String[] args) throws Exception{
        System.out.println("=========服务端启动==========");

        /**DatagramSocket的子类MulticastSocket可以在接收端绑定组播IP*/
        MulticastSocket socket = new MulticastSocket(9999);

        /**把当前接收端加入到一个组播组中去：绑定对应的组播消息的组播IP*/
//        socket.joinGroup(InetAddress.getByName("224.0.1.1"));
        socket.joinGroup(new InetSocketAddress(InetAddress.getByName("224.0.1.1"),9999),NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));

        byte[] buffer = new byte[1024 *64];       //64kb的包来接数据
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            socket.receive(packet);

            int len = packet.getLength();
            String rs = new String(buffer,0,len);

            System.out.println("收到了来自：" + packet.getAddress() + "端口号为：" + packet.getPort() + "消息是："+ rs);
        }

    }
}
