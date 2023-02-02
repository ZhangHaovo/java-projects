package com.hao.d3_Demo;
/*使用面向对象编程模拟:设计一个电脑对象，可以安装2个USB设备
 鼠标:被安装时可以完成接入、调用点击功能、拔出功能。
 键盘:被安装时可以完成接入、调用打字功能、拔出功能。
 */
public class Test {
    public static void main(String[] args) {
        //创建电脑对象
        Computer c = new Computer("MSI");

        //创建键盘鼠标对象
        USB k = new Keyboard("AKKO");
        USB m = new Mouse("RAZER");
        c.install(k);
        c.install(m);
    }
}
