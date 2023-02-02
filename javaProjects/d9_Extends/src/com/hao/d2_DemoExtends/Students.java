package com.hao.d2_DemoExtends;
//学生：名称，年龄，所在班级，查看课表，填写听课反馈
//老师：名称，年龄，部门所在，查看课表，发布问题
public class Students extends People{
    private String classNum;

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public void write(){
        System.out.println(getName() + "正在填写听课反馈");

    }
}
