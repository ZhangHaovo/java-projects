package com.hao.d2_exception.d4_exceptiom_custom.d1_custom_compile;

public class test {
    public static void main(String[] args) {
        /**
         * 自定义异常
         *      好处：1.可以是同异常的机制管理业务问题，如提醒程序员注意
         *           2.同时一旦出现bug，可以用异常的形式清晰地指出出错的地方
         *      分类：1.自定义编译时异常：（1）定义一个异常继承Exception
         *                            (2)重写构造器
         *                            (3)在出现bug的地方使用throw new自定义对象抛出
         *           2.自定义运行时异常：（1）定义一个异常类继承RuntimeException
         *                            (2)重写构造器
         *                            (3)在出现bug的地方使用throw new自定义对象抛出
         *                            作用：提醒不强烈，编译阶段不报错，运行时才可能出现
         */
        try {
            checkAge(-34);       //提醒调用者此参数输入需要注意
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAge(int age) throws AgeIllegalException {
        if (age < 0 || age > 200){
            //抛出去一个异常对象给调用者
            //throw：在方法内部直接创建一个对象并从此点抛出
            //throws：用在方法申明上的，抛出方法内部的异常
            throw new AgeIllegalException(age + " is illegal");
        }else {
            System.out.println("年龄合法");
        }
    }
}
