package com.hao.d1_factory_pattern;

public class FactoryPattern {
    /**定义一个方法，创建对象返回*/
    public static Computer createComputer(String info){
        switch (info){
            case "huawei":
                Computer c = new Huawei();
                c.setName("Huawei pc");
                c.setPrice(5999);
                return c;
            case "com.hao.d1_factory_pattern.Mac":
                Computer c1 = new Mac();
                c1.setName("Mac pro");
                c1.setPrice(19999);
                return c1;
            default:
                return null;
        }
    }
}
