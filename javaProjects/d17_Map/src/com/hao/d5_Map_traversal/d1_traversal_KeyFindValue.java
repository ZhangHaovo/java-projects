package com.hao.d5_Map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d1_traversal_KeyFindValue {
    public static void main(String[] args) {
        /*����Map���ϵķ�ʽ��
        ��һ�ַ�ʽ������ֵ
            ���裺�Ȼ�ȡMap���ϵ�ȫ������Set���ϣ���������Set���ϣ�Ȼ��ͨ������ȡ��Ӧֵ
         */
        Map<String , Integer> maps = new HashMap<>();
        maps.put("iphoneX",10);
        maps.put("����",31);
        maps.put("iphoneX",100);
        maps.put("huawei" , 1000);
        maps.put("������Ʒ" , 10);
        maps.put("�ֱ�" , 10);
        System.out.println(maps);

        Set<String> keys = maps.keySet();
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + "-->" + value);
        }

    }
}
