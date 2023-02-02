package com.hao.d1_Abstract;
/*
�񴴽�һ�ſ�Ƭ����:�������԰����������ơ���֧������(����ʵ�ֽ�������)
�񴴽�һ-�Ű׽���:��д֧�����ܣ�����ԭ�۵�8�ۼ��������
�񴴽�һ��������: ��д֧�����ܣ�����ԭ�۵�8.5�ۼ��������
 */
public class DemoAbstract {
    public static void main(String[] args) {
        Dold user = new Dold();
        user.setName("����");
        user.setBalance(10000);
        user.pay(100);
    }
}

abstract class Card{
    private String name;
    private double balance;
    public abstract void pay(double consume);

    public Card() {
    }

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Silver extends Card{
    @Override
    public void pay(double consume) {
        System.out.println("����ǰ�����ˣ�" + consume);
        double pay = consume * 0.8;
        System.out.println("��ʵ��֧��Ϊ" + (pay));
        setBalance(getBalance() - pay);
        System.out.println("�������Ϊ��" + super.getBalance());
    }
}

class Dold extends Card{
    @Override
    public void pay(double consume) {
        System.out.println("����ǰ�����ˣ�" + consume);
        double pay = consume * 0.8;
        System.out.println("��ʵ��֧��Ϊ" + (pay));
        setBalance(getBalance() - pay);
        System.out.println("�������Ϊ��" + getBalance());
    }
}

