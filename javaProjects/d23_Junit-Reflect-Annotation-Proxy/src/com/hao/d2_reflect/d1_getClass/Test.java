package com.hao.d2_reflect.d1_getClass;
/**反射概述
 * 反射是指对于任何一个Class类，在"运行的时候"都可以直接得到这个类全部成分。
 * 在运行时,可以直接得到这个类的构造器对象：Constructor
 * 在运行时,可以直接得到这个类的成员变量对象：Field
 * 在运行时,可以直接得到这个类的成员方法对象：Method
 * 这种运行时动态获取类信息以及动态调用类中成分的能力称为Java语言的反射机制。
 *
 * 反射的基本作用:反射是在运行时获取类的字节码文件对象：然后可以解析类中的全部成分
 * 反射的核心思想和关键就是:得到编译以后的class文件对象*/
public class Test {
    public static void main(String[] args) throws Exception{
        /**1.Class类中静态方法:forName(String className) 参数：包名+权限名*/
        Class c = Class.forName("com.hao.d2_reflect.d1_getClass.Student");
        System.out.println(c);

        /**2、类名.class*/
        Class c1 = Student.class;
        System.out.println(c1);

        /**3、对象.getClass()*/
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);

    }
}
