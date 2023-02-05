package com.hao.d1_NetAddress;
/**# 网络通信

 基本模式
 常见的通信模式有如下2种形式：Client-Server(CS) 、 Browser/Server(BS)


 UDP通信：消息直接发送给对象，不确认对方是否在线，不做消息确认。
 TCP通信：基于可靠传输的方式进行的通信模式。解决不同场景的通信需求。


 实现网络编程关键的三要素：
 #### 1.IP地址：设备在网络中的地址，是唯一的标识。
 - IP（Internet Protocol）：全称”互联网协议地址”，是分配给上网设备的唯一标志。
 - 常见的IP分类为：IPv4和IPv6
 ##### ①IP地址形式：
 - 公网地址、和私有地址(局域网使用)。
 - 192.168. 开头的就是常见的局域网地址，范围即为192.168.0.0--192.168.255.255，专门为组织机构内部使用。
 ##### ②IP常用命令：
 - ipconfig：查看本机IP地址
 - ping IP地址：检查网络是否连通
 ##### ③特殊IP地址：
 - 本机IP: 127.0.0.1或者localhost：称为回送地址也可称本地回环地址，只会寻找当前所在本机。

 #### 2.端口：应用程序在设备中唯一的标识。

 #### 3.协议:   数据在网络中传输的规则，常见的协议有UDP协议和TCP协议。

 InetAddress 的使用：此类表示Internet协议（IP）地址。*/
public class d1_NetAddress {
    public static void main(String[] args) {
        /**获取本机地址对象*/
    }
}
