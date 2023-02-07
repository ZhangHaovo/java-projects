package com.hao.d2_reflect.d3_effect;
/**反射的作用:2.反射做通用框架
 * - 给你任意一个对象，在不清楚对象字段的情况可以，可以把对象的字段名称和对应值存储到文件中去。*/

public class d2_reflect {
    public static void main(String[] args) {
        Student s =  new Student();
        s.setName("猪八戒");
        s.setClassName("1班");
        s.setAge(23);
        s.setHobby("吃");
        s.setSex('男');
        d2_reflect_MybatisUtil.sava(s);

        Teacher t = new Teacher();
        t.setName("波仔");
        t.setSex('男');
        t.setSalary(2352);
        d2_reflect_MybatisUtil.sava(t);

    }
}
