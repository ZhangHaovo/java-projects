package com.hao.d1_Collection.d13_Project_Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Game {
    /*������Ϸ����ʱӦ����ǰ׼����54���ƣ����ϴ�ƣ����ƣ��������߼�
            ��������ϵͳ������ͬʱ��Ҫ׼�������ݵģ��Ϳ����þ�̬�������
                ϴ�ƾ��Ǵ����Ƶ�˳��
                ����������ң����η���51����
                ����ҵ��ƽ�������
         */

    //1.����һ����̬�ļ��ϴ洢54���ƶ���
    public static List<Card> allCards = new ArrayList<>();

    //2.���ƣ����徲̬������ʼ��������
    static {
        //3.�������������ȷ��������ȷ����ʹ������
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q", "K","A","2"};
        //4.���廨ɫ������ȷʵ������ȷ����ʹ������
        String[] colors = {"����","����","����","÷��"};
        //5.��ϵ����뻨ɫ
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //6.��װ��һ���ƶ���
                Card card = new Card(size,color,index);
                //7.���뼯��������ȥ
                allCards.add(card);
            }

        }
        //8.��С�����뼯����ȥ
        Card c1 = new Card("","����",++index);
        Card c2 = new Card("","С��",++index);
        Collections.addAll(allCards,c1,c2);
        System.out.println("����" + allCards);
    }

    public static void main(String[] args) {

        //9.ϴ��
        Collections.shuffle(allCards);
        System.out.println("ϴ�ƺ�" + allCards);

        //10.���ƣ�����������ң�ÿһ������൱��һ������������
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();

        //11.��ʼ���ƣ����Ƽ����з���51���Ƹ�������ң�ʣ��3����Ϊ���ƣ�
        for (int i = 0; i < allCards.size() - 3; i++) {
            //���õ���ǰ����
            Card c = allCards.get(i);
            if (i % 3 == 0) {
                player1.add(c);
            }else if (i % 3 == 1){
                player2.add(c);
            } else if (i % 3 == 2) {
                player3.add(c);
            }
        }
        //12.�õ���������ƣ�����������ƽ�ȡ��һ���Ӽ��ϣ�
        List<Card> lastTreeCards = allCards.subList(allCards.size() - 3 , allCards.size());

        //13.���÷�������ҵ�������
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);

        //14.�����ҵ��ƣ�
        System.out.println("player1��" + player1);
        System.out.println("player2��" + player2);
        System.out.println("player3��" + player3);
        System.out.println("���ŵ��ƣ�" + lastTreeCards);
    }

    private static void sortCards(List<Card> players) {
        Collections.sort(players, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex() - o1.getIndex();
            }
        });
    }
}
