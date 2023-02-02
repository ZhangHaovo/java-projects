package com.hao.d1_Collection.d10_Set;

public class d5_Set_TreeSet_classApple implements Comparable<d5_Set_TreeSet_classApple> {
    private String name;
    private String color;
    private double price;
    private int weight;

    public d5_Set_TreeSet_classApple() {
    }

    public d5_Set_TreeSet_classApple(String name, String color, double price, int weight) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override           //��ʽһ�����Զ������ʵ��Comparable�ӿ���д�����comparableTo������ָ���ȽϹ���
    public int compareTo(d5_Set_TreeSet_classApple o) {
        return  this.weight - o.weight >=0 ? 1 : -1;
    }

    @Override
    public String toString() {
        return "d5_Set_TreeSet_classApple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
