package com.hao.d4_proxy;

public class Star implements Skill{
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name + "开始跳舞");
    }

    public void sing(){
        System.out.println(name + "开始唱歌");
    }
}
