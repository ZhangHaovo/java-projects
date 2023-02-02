package com.hao.d2_InnerClassAnonymous;

public class Test2 {
    public static void main(String[] args) {
        go(new swim() {         //�����ڲ���
            @Override
            public void swimming() {
                System.out.println("ѧ����Ӿ");
            }
        });
    }

    public static void go(swim s){
        System.out.println("��ʼ");
        System.out.println("����");
}

interface swim{
    void swimming();
}

//class Studnet implements swim{
//    @Override
//    public void swimming() {
//        System.out.println("ѧ����Ӿ");
//    }
}
