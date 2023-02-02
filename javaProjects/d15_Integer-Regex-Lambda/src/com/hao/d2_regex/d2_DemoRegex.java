package com.hao.d2_regex;

import java.util.Scanner;

public class d2_DemoRegex {
    public static void main(String[] args) {
        //Ŀ�꣺У���ֻ����룬����
        checkPhone();
        checkEmail();
    }
    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������ֻ��ţ�");
        String phone = sc.next();
        if (phone.matches("1[3-9]\\d{9}")) {
            System.out.println("��ʽ��ȷ");
        } else {
            System.out.println("�ֻ������ʽ����ȷ");
        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����������䣺");
        String email = sc.next();
        //2311414@qq.com
        //1414142asf@gmail.com
        //14314412ff@pci.com.cn
        if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){         // \\.����ʶ��".",��һ��\����ʶ��"."�ڶ���\����ʶ��"\"    ��ʶ��.com��.com.cn
            System.out.println("��ʽ��ȷ");
        }
        else {
            System.out.println("�����ʽ����ȷ");
        }
    }

    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������������ţ�");
        String tel = sc.next();
        //027-51435143
        //02746185648
        if (tel.matches("0\\d{2,6}-?\\d{5,20}")){         // ?:һ�λ��߸����Ͳ�
            System.out.println("��ʽ��ȷ");
        }
        else {
            System.out.println("�����Ÿ�ʽ����ȷ");
        }
    }
}