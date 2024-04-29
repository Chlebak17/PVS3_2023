package oop.collections.mapping;

import java.util.Date;

public class MovieMapping {
    String name;
    int yearOfRealese;
    String genre;
    double rating;
    int duration;
    String director;

    @Override
    public String toString() {
        return "================\n" +
                "Name: " + name + "\n" +
                "Written by: " + director + "\n" +
                "Genre: " + genre + "\n" +
                "Released in " + yearOfRealese + "\n" +
                "Runtime is: " + duration + "\n" +
                "Rating: " + rating + " out of 10\n" +
                "==============\n";
    }

    public MovieMapping(String name, int yearOfRealese, String genre, double rating, int duration, String director) {
        this.name = name;
        this.yearOfRealese = yearOfRealese;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.director = director;
    }
}
