package com.hao.d1_Collection.d4_Collection_object;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {

        //?洢????????????
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("?????????????",9.5,"??С??????"));
        movies.add(new Movie("????????????",8.5,"???????????"));
        movies.add(new Movie("?????С????",8.6,"???????????"));

        //?????????е?????????
        for (Movie movie : movies) {
            System.out.println("???" + movie.getName());
            System.out.println("?÷?" + movie.getScore());
            System.out.println("????" + movie.getActor());
        }
    }
}
