package com.hao.d1_Abstract;
/*
模板方法模式：当系统中出现一个功能多处在开发，而该功能中大部分代码是一样的，只有其中部分可能不同
    1.使用场景：把功能定义成一个所谓的模板方法，放在抽象类中，模板方法中只定义通用且能确定的代码，不能决定的功能定义成抽象方法让具体子类去实现
    2.注意：模板方法最好使用final修饰，以访模板方法被修改
 */
public class abstractTemplate {
    public static void main(String[] args) {
        childStudent child = new childStudent();
        child.write();
        middleStudent middle = new middleStudent();
        middle.write();
    }
}

abstract class Student {                    //模板方法模式
        public final void write(){                    //已确定的内容作为模板提前给出,最好使用final修饰
        System.out.println("通用模板1");
        diff();
        System.out.println("通用模板2");
    }
    public abstract void diff();                //未确定的内容作为抽象方法给子对象重写
}

class childStudent extends Student{
    @Override
    public void diff() {
        System.out.println("小学生专用");
    }
}

class middleStudent extends Student{
    @Override
    public void diff() {
        System.out.println("中学生专用");
    }
}