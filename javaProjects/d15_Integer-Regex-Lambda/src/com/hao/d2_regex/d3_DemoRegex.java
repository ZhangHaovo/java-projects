package com.hao.d2_regex;

public class d3_DemoRegex {
    public static void main(String[] args) {
        //public String[] split replace(String regex):����������ʽƥ������ݽ��зָ��ַ���������һ���ַ�������
        String names = "����faszdr����eagsrfzdv����";
        String arr1[] = names.split("\\w+");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //public String replaceAll(String regex,String newStr):����������ʽƥ�������ȥ�滻
        String str = names.replaceAll("\\w+"," ");
        System.out.println(str);
    }
}
