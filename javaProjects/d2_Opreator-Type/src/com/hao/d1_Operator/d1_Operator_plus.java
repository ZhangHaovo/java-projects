package com.hao.d1_Operator;

public class d1_Operator_plus {
    public static void main(String[] args) {
        // + 符号做连接符的识别
        //能算就算 不能算就连在一起

        int a = 5;
        System.out.println("abc" + 'a'); //abca
        System.out.println("abc" + a );  //abca
        System.out.println(5 + a);       //10
        System.out.println("abc" + 5 +'a');  //abc5a
        System.out.println(15 + "abc" +15);  //15abc15
        //变量和字符能够一起运算
        //变量能够和空字符串运算 不能和非空字符串运算
        System.out.println(a + 'a');            //102
        System.out.println(a + "" +5);             //55 (字符串55）
        System.out.println(a + 'a' + " abcdefg "); //102abcdefg
        System.out.println(" abcdefg " + a + 'a'); //abcdefg5a
        System.out.println(" abcdefg " + ( a + 'a' )); //abcdefg102
    }
}
