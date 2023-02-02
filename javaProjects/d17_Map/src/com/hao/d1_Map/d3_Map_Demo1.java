package com.hao.d1_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class d3_Map_Demo1 {
    //利用Map统计次数
    //某个班级多名学生，提供了4个景点（A,B,C,D）,每个学生可以选择一个景点，请统计最终哪个景点想去的人数最多
    public static void main(String[] args) {
        String[] str = {"A","B","C","D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(str[r.nextInt(4)]);
        }
        System.out.println(sb);

        Map<Character , Integer> maps = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (maps.containsKey(ch)) {
                maps.put(ch,maps.get(ch) + 1);      //将键为ch的元素覆盖
            }else {
                maps.put(ch,1);
            }
        }
        System.out.println(maps);
    }
}
