package com.hao.d2_reflect.d2_method;
/**使用反射技术获取构造器对象并使用*/

import org.junit.Test;

import java.lang.reflect.Constructor;

/**反射的第一步是先得到类对象，然后从类对象中获取类的成分对象。
 Class类中用于获取构造器的方法*/
public class d1_getConstructor {
    /**获取全部的构造器：只能获取public修饰的构造器
     * Constructor<?>[] getConstructors()返回所有构造器对象的数组（只能拿public的）*/
    @Test
    public void getConstructors(){
        /**获取类对象*/
        Class c = Student.class;
        /**提取类中的全部public构造器对象*/
        Constructor[] constructors = c.getConstructors();
        /**遍历构造器*/
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    /**Constructor<?>[] getDeclaredConstructors()返回所有构造器对象的数组，存在就能拿到*/
    @Test
    public void getDeclaredConstructors(){
        /**获取类对象*/
        Class c = Student.class;
        /**提取类中的全部构造器对象*/
        Constructor[] constructors = c.getDeclaredConstructors();
        /**遍历构造器*/
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
        }
    }

    /**Constructor<T> getConstructor(Class<?>... parameterTypes) 返回单个构造器对象（只能拿public的）*/
    @Test
    public void getConstructor() throws Exception{
        /**获取类对象*/
        Class c = Student.class;
        /**提取类中单个构造器对象(按照参数定位无参数构造器)*/
        Constructor constructor = c.getConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
    }

    /**Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造器对象，存在就能拿到*/
    @Test
    public void getDeclaredConstructor() throws Exception{
        /**获取类对象*/
        Class c = Student.class;
        /**提取类中单个构造器对象(按照参数定位无参数构造器)*/
        Constructor constructor = c.getDeclaredConstructor();
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());

        /**定位某个有参构造器*/
        Constructor constructor1 = c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor.getName() + "===>" + constructor.getParameterCount());
    }
}
