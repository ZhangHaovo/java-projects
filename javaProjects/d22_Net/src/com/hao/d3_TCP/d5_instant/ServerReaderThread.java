package com.hao.d3_TCP.d5_instant;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg;
            while((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress() + "说了：" + msg);
                /**把这个消息进行端口转发给全部客户端socket管道*/
                sendMsgToAll(msg);
            }
        } catch (Exception e) {
            /**下线将socket移除*/
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            Serve01.allOnlineSockets.remove(socket);
        }
    }

    /**将接收的消息转发给全部*/
    private void sendMsgToAll(String msg) throws Exception{
        for (Socket socket : Serve01.allOnlineSockets) {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}
