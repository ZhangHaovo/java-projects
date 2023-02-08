package com.hao.d2_decorate_pattern;
/**装饰设计模式:创建一个新类，包装原始类，从而在新类中提升原来类的功能。
 *
 * 装饰设计模式的作用：装饰模式指的是在不改变原类的基础上, 动态地扩展一个类的功能。
 *
 * 步骤：
 * 定义父类。
 * 定义原始类，继承父类，定义功能。
 * 定义装饰类，继承父类，包装原始类，增强功能！！  */
public class Demo {
    public static void main(String[] args) {
        MyInputStream is = new MyBufferedInputStream(new MyFileInputStream());
        System.out.println(is.read());
        System.out.println(is.read(new byte[3]));
    }
}
