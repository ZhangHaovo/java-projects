package d1_Stirng;

public class d2_String_Address {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);     //由于ss1和ss2地址相同(都是常量池中的地址)所以显示true

        char[] chars1 = {'a','b','c'};
        String s3 = new String(chars1);
        String s4 = new String(chars1);
        System.out.println(s3 == s4);     //由于ss3和ss4地址不相同(在堆内存中的俩个不同对象)所以显示false

        String s5 = new String("abc");      //创建了2个对象(常量池和堆内存)
        String s6 = "abc";      //创建了0个对象("abc"在常量池中已经出现过)
        System.out.println(s5 == s6);       //false(s5地址指向堆内存中的对象，而s6指向常量池)

        String s7 = "abc";
        String s8 = "ab";
        String s9 = "ab" + "c";
        System.out.println(s7 == s8);       //false(s7在常量池,s9=s8+"c",s8是变量，s9是指向堆内存中)

        String s10 = "abc";
        String s11 = "a" + "b" + "c";
        System.out.println(s10 == s11);     //true(java存在编译优化机制，在程序编译时： "a" + "b" + "c"会直接转成 "abc")

    }
}
