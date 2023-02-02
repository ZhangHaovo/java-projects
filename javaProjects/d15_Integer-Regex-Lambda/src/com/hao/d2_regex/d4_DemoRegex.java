package com.hao.d2_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d4_DemoRegex {
    public static void main(String[] args) {
        //������ʽ������ȡ��Ϣ
        String rs = "ĳĳĳĳĳĳĳĳĳĳĳĳĳĳĳĳĳĳĳĳĳĳ���绰021-345345��������ϵ����" + "534253@gmail.com,�绰15475577523" + "����1253hkkl@qq.com,400-100-4155,4001004155";

        //���󣬴��������������ȡ���绰���������

        //1.������ȡ�����ַ�������ʽ
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

        //2.�������ȡ��������ƥ�����
        Pattern pattern = Pattern.compile(regex);     //��������ʽ�����ƥ�����

        //3.�õ�һ������ƥ��������
        Matcher matcher = pattern.matcher(rs);

        //4.��ʼѰ����Ϣ����
        while(matcher.find()){
            String str = matcher.group();
            System.out.println(str);
        }
    }
}
