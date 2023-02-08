package com.hao.d1_factory_pattern;

public class Mac extends Computer{
    @Override
    public void start() {
        System.out.println(getName() + "Mac启动了");
    }
}
