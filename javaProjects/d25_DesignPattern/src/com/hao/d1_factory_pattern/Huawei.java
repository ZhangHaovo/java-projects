package com.hao.d1_factory_pattern;

public class Huawei extends Computer{
    @Override
    public void start() {
        System.out.println(getName() + "Huawei启动了");
    }
}
