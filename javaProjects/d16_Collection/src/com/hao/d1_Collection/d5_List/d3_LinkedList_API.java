package com.hao.d1_Collection.d5_List;

import java.util.LinkedList;

public class d3_LinkedList_API {
    public static void main(String[] args) {
        //LinkedList 可以完成队列结构和栈结构（双链表）
        //栈
        LinkedList<String> stack = new LinkedList<>();
        //在第一个位置上添加元素
        stack.addFirst("第一颗子弹");
        stack.addFirst("第二颗子弹");
        stack.addFirst("第三颗子弹");
        stack.addFirst("第四颗子弹");
        System.out.println(stack);

        //删除第一个元素,返回取出的元素
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        //队列
        LinkedList<String> queue = new LinkedList<>();
        //在最后的位置上添加元素
        queue.addLast("1号");
        queue.addLast("2号");
        queue.addLast("3号");
        queue.addLast("4号");
        System.out.println(queue);
    }
}
