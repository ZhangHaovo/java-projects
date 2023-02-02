package com.hao.d2_constant;
/*
常量：使用 public static final 修饰的成员变量，必须初始化，而且执行过程中不能被改变
    1.作用与好处：方便程序维护，同时提高可读性
    2.命名规范：英文单词全部大写，多个单词下划线连接起来
    3.执行原理：在编译阶段会进行宏替换，把使用常量的地方全部替换成真实的字面量
    4.应用：做信息标志和分类，代码可读性好，实现了软编码形式
 */
public class constant {

    public static final String SCHOOL_NAME = "北大";

    public static void main(String[] args) {

    }
}
