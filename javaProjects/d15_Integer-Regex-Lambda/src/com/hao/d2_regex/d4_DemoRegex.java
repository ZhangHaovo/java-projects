package com.hao.d2_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d4_DemoRegex {
    public static void main(String[] args) {
        //正则表达式用于爬取信息
        String rs = "某某某某某某某某某某某某某某某某某某某某某某，电话021-345345，或者联系邮箱" + "534253@gmail.com,电话15475577523" + "邮箱1253hkkl@qq.com,400-100-4155,4001004155";

        //需求，从上面的内容中爬取出电话号码和邮箱

        //1.定义爬取规则，字符串的形式
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

        //2.把这个爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);     //把正则表达式编译成匹配对象

        //3.得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        //4.开始寻找信息数据
        while(matcher.find()){
            String str = matcher.group();
            System.out.println(str);
        }
    }
}
