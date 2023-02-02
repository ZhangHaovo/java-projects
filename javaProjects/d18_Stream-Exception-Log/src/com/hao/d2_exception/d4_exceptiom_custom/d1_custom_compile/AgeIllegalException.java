package com.hao.d2_exception.d4_exceptiom_custom.d1_custom_compile;

/**
 * 自定义编译时异常：（1）定义一个异常继承Exception
 *                 (2)重写构造器
 *                 (3)在出现bug的地方使用throw new自定义对象抛出
 */
public class AgeIllegalException extends Exception{
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {        //可以将异常的原因(message)传进来
        super(message);
    }
}
