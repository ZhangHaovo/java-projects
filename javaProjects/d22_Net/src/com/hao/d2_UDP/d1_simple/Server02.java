package com.hao.d2_UDP.d1_simple;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**接收端(服务端)*/
public class Server02 {
    public static void main(String[] args) throws Exception{
        System.out.println("=========服务端启动==========");
        /**创建接收端的数据包对象,注册端口
         * public DatagramSocket(int port) 创建接收端的Socket对象并指定端口号*/
        DatagramSocket socket = new DatagramSocket(8888);

        /**创建一个数据包对象，接受数据
         * public DatagramPacket(byte[] buf, int length)  buf：用来存储接收的内容 length：能够接收内容的长度*/
        byte[] buffer = new byte[1024 *64];       //64kb的包来接数据
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        /**等待接收数据
         * public void receive(DatagramPacket p)  接收数据包*/
        socket.receive(packet);

        /**取出数据(接受多少取出多少)*/
        int len = packet.getLength();
        String rs = new String(buffer,0,len);
        System.out.println("收到了：" + rs);

        /**获取发送端的ip和端口*/
        String ip = packet.getSocketAddress().toString();
        System.out.println("对象地址" + ip);
        int port = packet.getPort();
        System.out.println("对方端口" + port);

        /**关闭管道资源*/
        socket.close();
    }
}
