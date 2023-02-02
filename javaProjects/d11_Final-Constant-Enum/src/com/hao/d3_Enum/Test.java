package com.hao.d3_Enum;

public class Test {
    public static void main(String[] args) {
        season(createEnum.SUMMER);
    }

    public static void season(createEnum e){
        switch(e){
            case SPRING -> System.out.println("春");
            case SUMMER -> System.out.println("夏");
            case AUTUMN -> System.out.println("秋");
            case WINTER -> System.out.println("冬");
        }
    }
}
