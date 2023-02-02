package com.hao.d4_jdk8_Time;

import java.time.LocalDate;
import java.time.Period;

//Period:计算时间差异，精确到年月日，用于LocalDate之间的比较
public class d7_Period {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate birthday = LocalDate.of(1999,12,02);

        Period period = Period.between(birthday,today);
        System.out.println(period.getYears() + "," + period.getMonths() + "," + period.getDays());
    }
}
