package com.hao.d1_javabean;
/*
JavaBean 也称为实体类，其对象可用于在程序中封装数据
书写要求：
    1.成员变量使用private修饰
    2.提供成员变量对应的setXxx()和getXxx()方法
    3.必须提供一个无参构造器；有参构造器是可写可不写的
*/

/*
自动生成构造器和set、get方法的快捷键：
    右键-Generate-Constructor/Setter/Getter
 */
public class User {

    private String name;
    private int num;
    private double score;

    public User() {
    }

    public User(String name, int num, double score) {
        this.name = name;
        this.num = num;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public double getScore() {
        return score;
    }
}
