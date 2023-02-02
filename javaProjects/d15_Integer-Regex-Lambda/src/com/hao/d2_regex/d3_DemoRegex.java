package com.hao.d2_regex;

public class d3_DemoRegex {
    public static void main(String[] args) {
        //public String[] split replace(String regex):按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组
        String names = "张三faszdr李四eagsrfzdv王五";
        String arr1[] = names.split("\\w+");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //public String replaceAll(String regex,String newStr):按照正则表达式匹配的内容去替换
        String str = names.replaceAll("\\w+"," ");
        System.out.println(str);
    }
}
