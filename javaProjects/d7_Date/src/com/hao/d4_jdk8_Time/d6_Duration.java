package com.hao.d4_jdk8_Time;

import java.time.Duration;
import java.time.LocalDateTime;

////Duration:计算时间间隔差异，用于LocalDateTime之间的比较,也可用于Instance之间的比较
public class d6_Duration {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime birthday = LocalDateTime.of(1999,12,02,20,12,13);

        Duration duration = Duration.between(birthday,ldt);
        System.out.println(duration.toDays() + "," + duration.toHours() + "," + duration.toMinutes() + "," + duration.toMillis() + "," + duration.toNanos());       //Millis()为毫秒值
    }
}
