package com.hao.d2_decorate_pattern;

/**装饰类*/
public class MyBufferedInputStream extends MyInputStream {
    //构造器
    private MyInputStream is;
    public MyBufferedInputStream(MyInputStream is) {
        this.is = is;
    }

    @Override
    public int read() {
        System.out.println("提供8kb的缓冲区，提高读写性能");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8kb的缓冲区，提高读写性能");
        return is.read(buffer);
    }
}
