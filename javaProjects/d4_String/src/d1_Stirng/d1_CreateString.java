package d1_Stirng;

public class d1_CreateString {
    public static void main(String[] args) {
        //String常被称为不可变字符串类型
        String name = "张三";
        name += "是";
        name += "学生";
        System.out.println(name);       //他的对象在创建后不能被更改，String变量每次的修改其实都是产生并指向了新的字符串对象

        //String类创建对象的2中方式

        //方式1：直接用”“来创建
        String s0 = "demo1";
        System.out.println(s0);

        //方式2：通过String类的构造器创建对象

        //1.public String()    创建一个空白字符串对象，不包含任何内容
        String s1 = new String();
        System.out.println(s1);

        //2.public String(String original)    根据传入的字符串内容，来创建字符串对象
        String s2 = new String("demo2");
        System.out.println(s2);

        //3.public String(char[] chs)     根据字符数组的内容，来创建字符串对象
        char[] chars = {'d','e','m','o','3'};
        String s3 = new String(chars);
        System.out.println(s3);

        //4.public String(byte[] chs)     根据字符数组的内容，来创建字符串对象
        byte[] bytes = {97,98,99,65,66,67};
        String s4 = new String(bytes);
        System.out.println(s4);     //转换成数字对应的字符
    }
}
