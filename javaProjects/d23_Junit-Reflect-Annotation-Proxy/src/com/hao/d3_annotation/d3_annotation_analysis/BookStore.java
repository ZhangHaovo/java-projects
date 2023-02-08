package com.hao.d3_annotation.d3_annotation_analysis;




@Book(value = "《西游记》",price = 99,author = {"吴承恩","Zhangsan"})
public class BookStore {
    @Book(value = "红楼梦",price = 23,author = "李四")
    public void test(){
    }
}
