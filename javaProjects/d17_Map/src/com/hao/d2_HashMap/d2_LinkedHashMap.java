package com.hao.d2_HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class d2_LinkedHashMap {
    public static void main(String[] args) {
        //HashMap:Ԫ�ذ��ռ������򣬲��ظ�����������ֵ����Ҫ���
        Map<String , Integer> maps = new LinkedHashMap<>();
        maps.put("Java",1);
        maps.put("HTML",3);
        maps.put("CSS",6);
        maps.put("Java",1);     //����ǰ���Ԫ��
        maps.put(null,null);
        System.out.println(maps);
    }
}
