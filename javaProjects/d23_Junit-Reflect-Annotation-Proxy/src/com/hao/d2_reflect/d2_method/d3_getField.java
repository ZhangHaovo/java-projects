package com.hao.d2_reflect.d2_method;

import org.junit.Test;

import java.lang.reflect.Field;

/**使用反射技术获取成员变量对象并使用
 * 反射的第一步是先得到类对象，然后从类对象中获取类的成分对象。
 * Class类中用于获取成员变量的方法
 */
public class d3_getField {
    /**Field[] getDeclaredFields() 返回所有成员变量对象的数组，存在就能拿到*/
    @Test
    public void getDeclaredFields(){
        Class c = Student.class;
        /**定位全部成员变量*/
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "===>" + field.getType());     //获取成员变量类型
        }
    }

    /**返回单个成员变量对象，存在就能拿到 (根据名字)Field getDeclaredField(String name)*/
    @Test
    public void getDeclaredField() throws Exception{
        Class c = Student.class;
        /**定位全部成员变量*/
        Field ageF = c.getDeclaredField("age");
        System.out.println(ageF.getName() + "===>" + ageF.getType());
        /**成员变量私有利用暴力打开*/
        ageF.setAccessible(true);

        /**成员变量赋值 void set(Object obj, Object value)：*/
        Student s = new Student();
        ageF.set(s,18);
        System.out.println(s);

        /**取值 Object get(Object obj)*/
        int age = (int)ageF.get(s);
        System.out.println(age);
    }

    /**Field[] getFields() 返回所有成员变量对象的数组（只能拿public的）*/
    /**Field getField(String name) 返回单个成员变量对象（只能拿public的）*/
}
