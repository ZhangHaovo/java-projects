package com.hao.d2_convert;
//多态形式下的类中转换机制
public class Test {
    public static void main(String[] args) {
        //自动类型转换
        Animal a = new Dog();
        a.run();
        //强制类型转换
        Dog d = (Dog) a;        //从父类类型到子类类型必须强制类型转换
        d.dog();    //子类中的独有功能

        //如果转换后的类型和对象真实类型不同，那么在转换的时候就会出现ClassCastException
        //Cat c = (Cat) a;        //强制类型转换，由于a对象属于Dog，强制转换成Cat,编译阶段不会报错，运行时则可能出错(ClassCastException)

        Animal a2 = new Cat();
        /*
        Java建议强转前使用instanceof判断当前对象的真实类型，再进行强制转换
        变量名 instanceof 真实类型     （判断关键词左边的变量指向的对象的真实类型，是否是右边的类型或者是其子类类型，是则返回true）
         */
        if(a2 instanceof Cat){
            Cat t = (Cat) a2;
            t.cat();
        } else if (a2 instanceof Dog) {
            Dog d1 = (Dog) a2;
            d1.dog();
        }
    }
}
