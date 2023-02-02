package com.hao.d4_Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class d2_DemoLambda {
    public static void main(String[] args) {
        Integer[] arr1 ={12,11,41,52,73,12,35};

//        Arrays.sort(arr1,new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });

        //����ʽ
//        Arrays.sort(arr1,(Integer o1, Integer o2)->{
//            return o2 - o1;
//        });

        //��Ϊ�򻯵���ʽ
//        Arrays.sort(arr1,(o1, o2) -> {      //ʡ�Բ�������
//            return o2 - o1;
//        });

        //����Ϊ�򻯵���ʽ
        Arrays.sort(arr1,(o1, o2) -> o2 - o1);      //ֻ��һ�д���ʱʡ�Դ����źͷֺţ�����return�Ļ�ʡ��return

        System.out.println(Arrays.toString(arr1));
    }
}
