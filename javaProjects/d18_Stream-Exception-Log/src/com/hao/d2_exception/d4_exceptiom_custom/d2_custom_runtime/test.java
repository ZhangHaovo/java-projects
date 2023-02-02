package com.hao.d2_exception.d4_exceptiom_custom.d2_custom_runtime;

import com.hao.d2_exception.d4_exceptiom_custom.d1_custom_compile.AgeIllegalException;

/**自定义运行时异常：（1）定义一个异常类继承RuntimeException
                    (2)重写构造器
                    (3)在出现bug的地方使用throw new自定义对象抛出
                    作用：提醒不强烈，编译阶段不报错，运行时才可能出现
 */
public class test {
    public static void main(String[] args) {
        try {
            checkAge(-23);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAge(int age){       //运行时异常无需抛异常
        if (age < 0 || age > 200){
            //抛出去一个异常对象给调用者
            //throw：在方法内部直接创建一个对象并从此点抛出
            //throws：用在方法申明上的，抛出方法内部的异常
            throw new AgeIllegalRuntimeException(age + " is illegal");
        }else {
            System.out.println("年龄合法");
        }
    }
}
