package com.hao.d3_createObject;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "BMW";
        car.price = 380000.01;
        System.out.println(car.name);
        System.out.println(car.price);
        car.start();
        car.run();

        Car car2 = new Car();
        car2.run();
    }
}
