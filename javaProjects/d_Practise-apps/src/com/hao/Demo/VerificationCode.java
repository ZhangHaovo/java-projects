package com.hao.Demo;

import java.util.Random;
import java.util.Scanner;

//生成5位随机验证码，每一位可能是数字，大写字母，小写字母
public class VerificationCode {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int input;
        System.out.println("你想要输入几位验证码？");
        input = sc.nextInt();
        String code = verificationcode(input);
        System.out.println(code);
    }

    public static String verificationcode(int input){
        Random r = new Random();

        int i,type;
        String code = "";

        for (i = 0; i < input; i++) {
             type = r.nextInt(1,4);

             switch (type){
                 case 1:        //数字
                     code += r.nextInt(0,10);
                     break;
                 case 2:        //大写字母
                     code +=  ((char)('A'+ r.nextInt(26)));
                     break;
                 case 3:        //小写字母
                     code +=  ((char)('a'+ r.nextInt(26)));
                     break;
             }
        }
        return code;
    }

}
