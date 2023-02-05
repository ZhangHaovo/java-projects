package com.hao.d3_TCP.d4_thread_pool;


import com.hao.d3_TCP.d3_multiple_clients.ServerReaderThread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**客户端*/
public class Serve01 {

    /**使用静态变量记住一个线程池对象*/
    private static ExecutorService pool = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        try {
            System.out.println("==服务端启动成功==");

            ServerSocket serverSocket = new ServerSocket(7777);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                Runnable target = new ServerReaderRunnable(socket);
                pool.execute(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
