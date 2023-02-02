package com.hao.d4_Lambda;

public class d1_Lambda {
    public static void main(String[] args) {
        /*Lambda概述：用于简化内部类的代码写法（注意：Lambda表达式只能简化函数式接口的匿名内部类的写法形式）
          函数式接口：首先是接口，其次接口中有且仅有一个抽象方法的形式，通常会在接口上加上一个@FunctionalInterface注解，标记该接口必须是满足函数式接口
            1.格式：
            (匿名内部类被重写方法的形参列表)->{
                被重写方法的方法体代码;
            }
            2.简化机制：  （1）参数类型可以不写
                        （2）如果只有一个参数，参数类型可以省略，同时()也可以省略
                        （3）如果方法体中只有一行代码，可以省略大括号不写，同时要省略分号
                        （3）如果方法体中只有一行代码，可以省略大括号不写，此时，如果这行代码是return语句，必须省略return,同时也必须省略";"不写
         */



//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("游泳");
//            }
//        };

        //简化写法
        Swimming s1 = () -> {
            System.out.println("游泳");
        };
        go(s1);

//        go(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("学生游泳");
//            }
//        });
        //更为简化的形式
        go(()->{
            System.out.println("学生游泳");
        });
    }


    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

@FunctionalInterface        //一旦加上此注解，就一定是函数式接口，里面只能有一个抽象方法
interface Swimming {
    void swim();
}
