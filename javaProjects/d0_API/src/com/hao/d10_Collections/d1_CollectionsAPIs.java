package com.hao.d10_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class d1_CollectionsAPIs {
    public static void main(String[] args) {
        //Collections ?????????????????????????????????

        //????APIs

        List<String> names = new ArrayList<>();
        //1.??????????????????
        //public static <T> boolean addAll (Collections<? super T> c, T...elements)
        Collections.addAll(names,"????","????","????","????");
        System.out.println(names);

        //2.??????????
        //public static void shuffle(List<?> list)
        Collections.shuffle(names);
        System.out.println(names);

        //3.???????е?????????????????(?????????????TreeSet??????????????List?????????)
        //public static <T> void sort(List<T> list)
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,70,30,60,20,10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
