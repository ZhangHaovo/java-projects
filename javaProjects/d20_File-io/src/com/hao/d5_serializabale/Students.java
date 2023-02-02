package com.hao.d5_serializabale;

import java.io.Serializable;

/**注意：对象如果要序列化，必须实现Serializable序列化接口*/
public class Students implements Serializable{
    /**申明序列化的版本号*/
    private static final long serialVersionUID = 1;
    private String name;
    private String loginName;
    /**transient修饰的变量不参与序列化*/
    private transient String password;
    private int age;

    public Students() {
    }

    public Students(String name, String loginName, String password, int age) {
        this.name = name;
        this.loginName = loginName;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
