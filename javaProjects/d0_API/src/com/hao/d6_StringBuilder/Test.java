package com.hao.d6_StringBuilder;
/*
StringBuilder:是一个可变的字符串类，可以看成一个对象容器
    1.作用：提高字符串的操作效率，如拼接，修改等
 */
public class Test {
    public static void main(String[] args) {
        //public StringBuilder() 创建一个空白的可变的字符串对象，不包含任何内容
        StringBuilder s1 = new StringBuilder();      //空

        //public StringBuilder(String str)  创建一个指定字符串内容的可变字符串对象
        StringBuilder s2 = new StringBuilder("[");

        //public StringBuilder append(任意类型)     添加数据并返回StringBuilder对象本身
        s1.append("[").append('a').append(123).append("]");
        System.out.println(s1);         //省略了toString重写函数

        //public StringBuilder reverse()          将对象的内容反转
        s1.reverse().append("反转");
        System.out.println(s1);

        //public int length()                     返回对象内容长度
        System.out.println(s1.length());

        //注意：StringBuilder只是拼接字符串的手段，效率好，最终结果还是要恢复成
        //public String toString()                通过toString()就可以实现StringBuilder转换成String类型
        String rs = s1.toString();
        System.out.println(rs);
    }
}
