package com.hao.d2_UDP.d2_sustain;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**接收端(服务端)*/
public class Server02 {
    public static void main(String[] args) throws Exception{
        System.out.println("=========服务端启动==========");

        DatagramSocket socket = new DatagramSocket(8888);

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
