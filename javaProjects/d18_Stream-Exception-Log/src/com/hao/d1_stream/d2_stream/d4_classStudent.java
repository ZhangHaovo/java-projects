package com.hao.d1_stream.d2_stream;

public class d4_classStudent {
    private String name;

    public d4_classStudent() {
    }

    public d4_classStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "d4_classStudent{" +
                "name='" + name + '\'' +
                '}';
    }
}
