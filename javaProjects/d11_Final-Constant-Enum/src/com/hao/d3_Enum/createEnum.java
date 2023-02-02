package com.hao.d3_Enum;
/*
枚举：java中的一种特殊类型(是一种类)
    1.作用：为了做信息的标志和信息的分类
    2.特点：枚举类构造器都是私有的，对外不能创建对象，枚举第一行都是默认罗列对象的名称的
    3.优点：代码可读性好，入参约束严谨，是最好的信息分类技术
 */
public enum createEnum {
    //枚举的第一行必须罗列枚举类的对象名称，建议全部大写
    SPRING,SUMMER,AUTUMN,WINTER;
}
