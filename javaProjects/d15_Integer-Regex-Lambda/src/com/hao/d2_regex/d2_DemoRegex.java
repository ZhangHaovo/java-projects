package com.hao.d2_regex;

import java.util.Scanner;

public class d2_DemoRegex {
    public static void main(String[] args) {
        //目标：校验手机号码，邮箱
        checkPhone();
        checkEmail();
    }
    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入手机号：");
        String phone = sc.next();
        if (phone.matches("1[3-9]\\d{9}")) {
            System.out.println("格式正确");
        } else {
            System.out.println("手机号码格式不正确");
        }
    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入邮箱：");
        String email = sc.next();
        //2311414@qq.com
        //1414142asf@gmail.com
        //14314412ff@pci.com.cn
        if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){         // \\.用于识别".",第一个\用于识别"."第二个\用于识别"\"    可识别.com和.com.cn
            System.out.println("格式正确");
        }
        else {
            System.out.println("邮箱格式不正确");
        }
    }

    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入座机号：");
        String tel = sc.next();
        //027-51435143
        //02746185648
        if (tel.matches("0\\d{2,6}-?\\d{5,20}")){         // ?:一次或者根本就不
            System.out.println("格式正确");
        }
        else {
            System.out.println("座机号格式不正确");
        }
    }
}