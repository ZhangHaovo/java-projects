package com.hao.d1_InetAddress;

import java.net.InetAddress;

/**# 网络通信
 基本模式
 常见的通信模式有如下2种形式：Client-Server(CS) 、 Browser/Server(BS)

 UDP通信：消息直接发送给对象，不确认对方是否在线，不做消息确认。
 TCP通信：基于可靠传输的方式进行的通信模式。解决不同场景的通信需求。

 实现网络编程关键的三要素：
1.IP地址：设备在网络中的地址，是唯一的标识。
 - IP（Internet Protocol）：全称”互联网协议地址”，是分配给上网设备的唯一标志。
 - 常见的IP分类为：IPv4和IPv6
 ①IP地址形式：
 - 公网地址、和私有地址(局域网使用)。
 - 192.168. 开头的就是常见的局域网地址，范围即为192.168.0.0--192.168.255.255，专门为组织机构内部使用。
 ②IP常用命令：
 - ipconfig：查看本机IP地址
 - ping IP地址：检查网络是否连通
 ③特殊IP地址：
 - 本机IP: 127.0.0.1或者localhost：称为回送地址也可称本地回环地址，只会寻找当前所在本机。

2.端口：应用程序在设备中唯一的标识。
 ①端口号：标识正在计算机设备上运行的进程（程序），被规定为一个 16 位的二进制，范围是 0~65535。
 ②端口类型：
 - 周知端口：0~1023，被预先定义的知名应用占用（如：HTTP占用 80，FTP占用21）
 - 注册端口：1024~49151，分配给用户进程或某些应用程序。（如：Tomcat占 用8080，MySQL占用3306）
 - 动态端口：49152到65535，之所以称为动态端口，是因为它 一般不固定分配某种进程，而是动态分配。

3.协议:   数据在网络中传输的规则，常见的协议有UDP协议和TCP协议。

 InetAddress 的使用：此类表示Internet协议（IP）地址。*/
public class d1_InetAddress {
    public static void main(String[] args) throws Exception{
        /**获取本机地址对象
         * public static InetAddress getLocalHost() 返回本主机的地址对象*/
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1);
        /**获取此IP地址的主机名*/
        System.out.println(ip1.getHostName());
        /**返回IP地址字符串*/
        System.out.println(ip1.getHostAddress());

        /**获取域名IP对象*/
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        /**获取公网IP对象*/
        InetAddress ip3 = InetAddress.getByName("14.215.177.38");
        System.out.println(ip3.getHostName());
        System.out.println(ip3.getHostAddress());

        /**判断是否能通： ping 5s是是否连通
         * public boolean isReachable(int timeout) 在指定毫秒内连通该IP地址对应的主机，连通返回true*/
        System.out.println(ip3.isReachable(5000));
    }
}
