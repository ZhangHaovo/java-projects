package com.hao.d3_annotation.d1_create_annotation;

public @interface MyBook {
    public String name();
    String[] authors();
    double price();
}
