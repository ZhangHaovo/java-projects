package com.hao.d4_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy {
    /**设计一个方法来返回一个Star对象的代理对象*/
    public static Skill getProxy(Star obj){
        /**生成代理对象 public static Object newProxyInstance(ClassLoader loader, 参数一：生成类加载器
         Class<?>[] interfaces,     参数二：对象实现的接口列表
         InvocationHandler h) {     参数三：实现代理的处理逻辑，是一个匿名内部类
         Objects.requireNonNull(h);*/
        return (Skill)Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                /**让真正的对象实现方法，method是正在调用的方法对象,args代表这个方法的参数*/
                System.out.println("做一些辅助工作");
                Object rs = method.invoke(obj,args);
                return rs;
            }
        });
    }
}
