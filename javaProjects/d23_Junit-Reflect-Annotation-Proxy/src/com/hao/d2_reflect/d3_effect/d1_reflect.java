package com.hao.d2_reflect.d3_effect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**反射的作用:1.绕过编译阶段为集合添加数据
 * - 反射是作用在运行时的技术，此时集合的泛型将不能产生约束了，此时是可以为集合存入其他任意类型的元素
 * - 泛型只是在编译阶段可以约束集合只能操作某种数据类型，在编译成Class文件进入运行阶段的时候，其真实类型都是ArrayList了，泛型相当于被擦除了*/
public class d1_reflect {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.println(list1.getClass());

        list1.add(23);
        list1.add(35);

        /**将String类型的数据加入Integer集合中*/
        Class c = list1.getClass();
        Method add = c.getDeclaredMethod("add",Object.class);
        boolean rs = (boolean)add.invoke(list1,"zhangsan");
        System.out.println(rs);
        System.out.println(list1);
    }
}
