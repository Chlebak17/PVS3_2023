package oop.collections;

import java.util.ArrayList;

public class Movie {
    String name;
    Genre g;
    //nepouziva se tolik
    //String genreString

    public Movie(String name, Genre g) {
        this.name = name;
        this.g = g;
    }

    public static void main(String[] args) {
        Movie m = new Movie("Silent Hill",Genre.HORROR);
        ArrayList<Movie> movies = new ArrayList<>();

        for (Movie mo:
             movies) {
            if (mo.g == Genre.HORROR) {
                System.out.println(mo.name);
            }
        }
    }

}
