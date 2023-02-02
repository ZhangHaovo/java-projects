package com.hao.Demo;

import java.util.Scanner;

//6名评委给选手打分，分数范围是0-100
//选手最终得分为：去掉最高分、去掉最低分的4个分数的平均分
public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double max,min,sum,finalscore;
        double[] score = new double[6];
        System.out.println("依次输入6位评委的成绩：");

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextDouble();
        }

        sum = Sum(score);
        max = FindTheMax(score);
        min = FindTheMin(score);

        finalscore = ( sum - max - min ) / 4.0;
        System.out.println(finalscore);

    }

    public static double Sum(double score[]){
        double sum =0.0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }

    public static double FindTheMax(double score[]){
        int i;
        double max = score[0];
        for ( i = 0; i < score.length; i++) {
            if(score[i] > max)
                max = score[i];
        }
        return max;
    }

    public static double FindTheMin(double score[]){
        int i;
        double min = score[0];
        for ( i = 0; i < score.length; i++) {
            if(score[i] < min)
                min = score[i];
        }
        return min;
    }
}
