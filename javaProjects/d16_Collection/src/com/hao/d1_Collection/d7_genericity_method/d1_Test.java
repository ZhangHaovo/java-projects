package com.hao.d1_Collection.d7_genericity_method;

public class d1_Test {
    public static void main(String[] args) {
        //���ͷ��������巽����ͬʱ�����˷��͵ķ������Ƿ��ͷ���
            //��ʽ�����η�<���ͱ���>��������ֵ �������ƣ��β��б�{}
            //���ã�������ʹ�÷��ͽ���һ��ʵ�����͵Ĳ�����������߱�ͨ����
        String[] names = {"����","����","����"};
        printArray(names);

        Integer[] ages = {10,20,30};
        printArray(ages);
    }

    public static <T> void printArray(T[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ",");
            }
            sb.append("]");
            System.out.println(sb);
        }
        else {
            System.out.println(arr);
        }
    }
}
