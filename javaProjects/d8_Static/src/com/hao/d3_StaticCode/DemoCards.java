package com.hao.d3_StaticCode;

import java.util.ArrayList;

//��������Ϸ
public class DemoCards {
    //����һ����̬�ļ��ϣ������ļ���ֻ����һ�Σ���Ϊ����ֻ��Ҫһ����
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};                                                      //������ȷ��������ȷ��ʱ�����������洢
        String[] colors = {"?","?","?","?"};
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card = sizes[i] + colors[j];
                cards.add(card);
            }
        }
        cards.add("��?");
        cards.add("С?");
    }

    public static void main(String[] args) {
        System.out.println(cards);
    }
}
