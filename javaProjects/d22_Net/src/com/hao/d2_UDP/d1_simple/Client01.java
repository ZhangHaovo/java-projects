package com.hao.d2_UDP.d1_simple;
/**UDP:- UDP是一种无连接、不可靠传输的协议。
 - 将数据源IP、目的地IP和端口封装成数据包，不需要建立连接
 - 每个数据包的大小限制在64KB内
 - 发送不管对方是否准备好，接收方收到也不确认，故是不可靠的
 - 可以广播发送 ，发送数据结束时无需释放资源，开销小，速度快。
 UDP协议通信场景：语音通话，视频会话等*/
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
/**一发一收*/
/**发送端(客户端)*/
public class Client01 {
    public static void main(String[] args) throws Exception{
        System.out.println("=========客户端启动==========");
        /**创建发送端的Socket对象，系统会随机分配一个端口号。
         * public DatagramSocket()*/
        DatagramSocket socket = new DatagramSocket();

        /**创建一个数据包对象，封装数据 DatagramPacket：数据包对象
         public DatagramPacket(byte[] buf, int length, InetAddress address, int port) 创建发送端数据包对象
         buf：要发送的内容，字节数组
         length：要发送内容的字节长度
         address：接收端的IP地址对象
         port：接收端的端口号*/
        byte[] buffer = "发送数据的内容".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length, InetAddress.getLocalHost(),8888);

        /**发送数据
         * public void send(DatagramPacket dp) 发送数据包*/
        socket.send(packet);

        /**关闭管道资源*/
        socket.close();
    }
}
