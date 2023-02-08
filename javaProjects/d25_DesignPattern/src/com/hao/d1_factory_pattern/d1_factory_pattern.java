package com.hao.d1_factory_pattern;

/**工厂设计模式：
 * 之前我们创建类对象时, 都是使用new 对象的形式创建,在很多业务场景下也提供了不直接new的方式 。
 * 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一，  这种类型的设计模式属于创建型模式，它提供了一种获取对象的方式。
 *
 * 工厂设计模式的作用：
 * 工厂的方法可以封装对象的创建细节，比如：为该对象进行加工和数据注入。
 * 可以实现类与类之间的解耦操作（核心思想）。*/

public class d1_factory_pattern {
    public static void main(String[] args) {
        Computer c1 = FactoryPattern.createComputer("huawei");
        c1.start();
    }
}
