package com.hao.d2_reflect.d2_method;

import org.junit.Test;

import java.lang.reflect.Method;

/**使用反射技术获取方法对象并使用
 反射的第一步是先得到类对象，然后从类对象中获取类的成分对象。
 Class类中用于获取成员方法的方法
 */
public class d4_getMethod {
    /**Method[] getDeclaredMethods()返回所有成员方法对象的数组，存在就能拿到*/
    @Test
    public void getDeclaredMethods(){
        Class c = Student.class;
        /**获取全部方法*/
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "返回值类型：" + method.getReturnType() + "，参数个数：" + method.getParameterCount());
        }
    }


    /**Method getDeclaredMethod(String name, Class<?>... parameterTypes) 返回单个成员方法对象，存在就能拿到*/
    @Test
    public void getDeclaredMethod() throws Exception{
        Class c = Student.class;
        Method method = c.getDeclaredMethod("run",String.class);
        System.out.println(method.getName() + "返回值类型：" + method.getReturnType() + "，参数个数：" + method.getParameterCount());
        method.setAccessible(true);

        /**运行方法:参数一：用obj对象调用该方法,参数二：调用方法的传递的参数（如果没有就不写）,返回值：方法的返回值（如果没有就不写）Object invoke(Object obj, Object... args)*/
        Student s = new Student();
        Object result = method.invoke(s,"zhangsan");
        System.out.println(result);
    }

    /**Method[] getMethods() 返回所有成员方法对象的数组（只能拿public的）*/
    /**Method getMethod(String name, Class<?>... parameterTypes) 返回单个成员方法对象（只能拿public的）*/
}
