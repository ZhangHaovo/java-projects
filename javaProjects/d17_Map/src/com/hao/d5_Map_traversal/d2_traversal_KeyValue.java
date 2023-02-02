package com.hao.d5_Map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d2_traversal_KeyValue {
    public static void main(String[] args) {
        /*��ֵ�Ա���Map
                ����:1.�Ȱ�Map����ת����Set���ϣ�Set������ÿһ��Ԫ�ض��Ǽ�ֵ��ʵ��������
                    2.����Set���ϣ�Ȼ����ȡ���Լ���ȡֵ
         */
        Map<String , Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("����",31);
        maps.put("iphoneX",100);
        maps.put("huawei" , 1000);
        maps.put("������Ʒ" , 10);
        maps.put("�ֱ�" , 10);
        System.out.println(maps);

        //����ͨ������Map�ķ���entrySet��Map����ת����Set������ʽ
        //Set<Map.Entry<String,integer>> entries = [(huawei=1000),(�ֱ�=10),(������Ʒ=10),(iphoneX=100),(����=30)]      ������һ������
        Set<Map.Entry<String ,Integer>> entries = maps.entrySet();
        System.out.println(entries);

        //��ʱ����ʹ��foreach���б���
        for (Map.Entry<String ,Integer> entry :entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "-->" + value);
        }

    }
}
