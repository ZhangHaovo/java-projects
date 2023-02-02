package com.hao.d1_Map;

import java.util.*;

public class d4_Map_Demo2 {
    public static void main(String[] args) {
        //集合嵌套
        //某个班级多名学生，提供了4个景点（A,B,C,D）,每个学生可以选择多个景点，请统计最终哪个景点想去的人数最多（需要记录每个学生选择的情况）

        //1.使用一个Map集合存储
        Map<String , List<String>> maps = new HashMap<>();

        //2.把学生选择的数据存进去
        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1 , "A","B","D");
        maps.put("张三",selects1);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2 , "A","B");
        maps.put("李四",selects2);

        List<String> selects3 = new ArrayList<>();
        Collections.addAll(selects3 , "A","B","C");
        maps.put("王五",selects3);

        List<String> selects4 = new ArrayList<>();
        Collections.addAll(selects4 , "B","D");
        maps.put("刘六",selects4);

        System.out.println(maps);

        //统计每个景点所选的人数
        Map<String,Integer> infos = new HashMap<>();     //创建一个infos集合用于统计每个景点的投票个数

        Collection<List<String>> values = maps.values();        //利用.values取map中的所有值,返回的是集合

        for (List<String> value : values) {         //每一个value都是一个List集合
            for (String s : value) {
                if (infos.containsKey(s)){          //每一个s是一个键
                    infos.put(s, infos.get(s) +1);
                }else {
                    infos.put(s,1);
                }
            }
        }
        System.out.println(infos);
    }
}
