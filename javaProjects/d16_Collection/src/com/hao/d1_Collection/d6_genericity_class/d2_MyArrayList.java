package com.hao.d1_Collection.d6_genericity_class;

import java.util.ArrayList;

public class d2_MyArrayList<E> {

    private ArrayList lists = new ArrayList();

    public void add(E e ){
        lists.add(e);
    }

    public void remove(E e) {
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
