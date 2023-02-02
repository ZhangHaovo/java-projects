package com.hao.Demo;

//数字加密：先得到每位数，然后每位数都加上5,再对10求余，最后将所有数字反转，得到一串新数
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int original,digit,finalnum = 0,count = 1;
        System.out.println("请输入要加密的数字");
        original = sc.nextInt();
        digit = CountDigit(original);
        int[] arr = new int[digit];

        for (int i = 0; i < digit; i++) {       //数字加密
            if( original ==0){
                break;
            }
            else{
                arr[i] = (original % 10 + 5) % 10;
                original /= 10;
            }
        }

        for(int j = digit-1;j >= 0; j--){
             finalnum += arr[j] * count;
             count *= 10;
        }
        System.out.println(finalnum);
    }

    public static int CountDigit(int original){
        int count = 0;

        do{
            original /= 10;
            count++;
        }while (original != 0 );

        return count;
    }
}
