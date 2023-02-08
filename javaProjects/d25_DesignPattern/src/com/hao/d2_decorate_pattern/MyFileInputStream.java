package com.hao.d2_decorate_pattern;

import java.util.Arrays;

public class MyFileInputStream extends MyInputStream{

    @Override
    public int read() {
        System.out.println("低性能的模式读取了字节a");
        return 97;
    }

    @Override
    public int read(byte[] buffer) {
        buffer[0] = 97;
        buffer[1] = 98;
        buffer[2] = 99;
        System.out.println("低性能的模式读取了字节数组：" + Arrays.toString(buffer));
        return 3;
    }
}
