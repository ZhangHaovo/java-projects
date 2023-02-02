package com.hao.d2_regex;
/*正则表达式：可以用一些规定的字符来规定规则，并用来校验数据格式的合法性

[abc]           只能是a,b或c
[^abc]          除了abc之外的所有字符
[a-zA-Z]        a到z A到Z
[a-d[m-p]]      a到d或者m-p
[a-z&&[def]]    a-z中def（交集）
[a-z&&[^bc]]    a-z中除了b和c
[a-z&&[^m-p]]   a-z中除了m-p

.               任何数字
\d              一个数字[0-9]
\D              非数字[^0-9]
\s              一个空白字符[\t\n\x0B\f\r]
\S              非空白字符[^\s]
\w              [a-zA-z_0-9]英文数字下划线
\W              [^\w]一个非单词的字符

贪婪量词（匹配多个字符）
X?              X,一次或者根本不
X*              X,零次或者多次
X+              X,一次或者多次
X{n}            X,正好n次
X{n,}           X,至少n次
X{n,m}          X,至少n但不超过m次



 */

public class d1_createRegex {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("2235764132"));
        System.out.println(checkQQ("22357643qq"));
        System.out.println(checkQQ("22"));

        System.out.println("a".matches("[abc]"));   //true
        System.out.println("z".matches("[abc]"));   //false
        System.out.println("ab".matches("[abc]"));  //false
        System.out.println("ab".matches("[abc]+")); //true(匹配一个或者多个)
        System.out.println("----------------------------------------------------");

        //必须是数字、字母或者下划线，至少6位
        System.out.println("2235764werg".matches("\\w{6,}"));

        //验证码：必须是数字和字符，必须是4位
        System.out.println("234eh_".matches("[a-zA-Z0-9]{4,}"));
        System.out.println("234eh".matches("[a-zA-Z0-9]{4,}"));
        System.out.println("234eh_".matches("[\\w&&[^_]]{4,}"));
        System.out.println("234eh".matches("[\\w&&[^_]]{4,}"));
    }

    public static boolean checkQQ(String qq){
        return qq!=null && qq.matches("\\d{6,20}");     //验证qq号（不超过20位，不低于6位的数字验证）
    }
}
