package com.hao.d8_Object;

import java.util.Objects;

public class Student {
    private String name;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override                           //重写toString函数，快捷键：右键-> Generate-> toString
    public String toString() {          //对Object父类进行重写以返回数据信息
        return "Student{name = " + name + ", sex= " + sex + ", age= " + age + "}";
    }

//    @Override                           //重写equals函数
//    public boolean equals(Object obj) {
//        //判断 obj 是不是需要比较的类型
//        if( obj instanceof Student){
//            Student s2 = (Student) obj;
//            return this.name.equals(s2.name) && this.age == s2.age && this.sex.equals(s2.sex);
//        }else{
//            return false;
//        }
//    }
    @Override                              //官方提供的equals重写函数
    public boolean equals(Object o) {
        if (this == o) return true;        //判断是否是同一个对象比较
        if (o == null || getClass() != o.getClass()) return false;      //判断被比较的对象是否为空 或 比较对象类型与被比较类型是否相同
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }
}
