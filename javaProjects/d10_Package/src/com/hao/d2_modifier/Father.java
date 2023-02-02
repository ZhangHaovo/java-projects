package com.hao.d2_modifier;
/*
权限修饰符；用来控制一个成员能够访问的范围，可以修饰成员变量，方法，构造器，不同权限修饰符修饰的成员能够访问的范围将受到限制
        四种作用范围由小到大为 ( private -> 缺省 -> protected -> public )
        修饰符     |       同一个类中       |       同一个包中其他类        |       不同包下的子类     |       不同包中的无关类
        private   |          √           |             ×              |            ×           |            ×
        缺省       |          √           |             √              |            ×           |            ×
        protected |          √           |             √              |            √           |            ×
        public    |          √           |             √              |            √           |            √
应用场景：
    1. 成员变量一般私有
    2. 方法一般公开
    3. 如果希望成员只在本类中访问，使用private
    4. 如果该成员只希望本类，同一个包中的其他类和子类的访问，使用protected
 */
public class Father {

    //1.定义private修饰的成员:只能本类中访问
    private void privateMethod(){
        System.out.println("---private---");
    }

    //2.定义缺省修饰的成员 只能本类、同包中访问（包访问权限）
    void Method(){
        System.out.println("---缺省---");
    }

    //3.定义protected修饰的成员：本类、同包的其他类中、其他包的子类中
    protected void protectedMethod(){
        System.out.println("---protected---");
    }

    //4.定义public修饰的成员：本类、同包的其他类中、其他包的子类中、其他类中的无关类中
    public void publicMethod(){
        System.out.println("---public---");
    }


    /*
    本类中的方法:private、缺省、protected、public 都可以访问
     */
    public static void main(String[] args) {
        Father f = new Father();
        f.privateMethod();
        f.Method();
        f.protectedMethod();
        f.publicMethod();
    }
}
