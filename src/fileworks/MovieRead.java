package fileworks;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieRead {

    static ArrayList<Movie> movies = new ArrayList<>();
    static void loadMovies(String filePath){
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line  = br.readLine()) != null){
                System.out.println(line);
                movies.add(parseMovie(line));
            }
            br.close();
        }catch (IOException e){
            System.out.println("Error :  " + e.getMessage());
        }



    }
    static Movie parseMovie(String line){
        Movie m;
        String[] params = line.split(";");
        m = new Movie(params[0],Integer.parseInt(params[1]), Double.parseDouble(params[2]));
        return m;

    }
    public static void main(String[] args) {

        loadMovies("resources\\ComparableMovies.txt");
        System.out.println(movies);
    }
}

class Movie{
    String name;
    int year;
    double rating;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " year: " + year + " rating is " + rating;
    }
}