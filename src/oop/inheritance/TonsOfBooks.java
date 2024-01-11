package oop.inheritance;

import fileworks.DataImport;

import java.util.ArrayList;

public class TonsOfBooks {
    public static void main(String[] args) {
        DataImport di = new DataImport("books.txt");
        String line;
        String[] params;

        ArrayList<String> booken = new ArrayList<>();

        while(di.hasNext()){
            line = di.readLine();
            params = line.split(";");
            booken.add(params[0]);
        }
        for (String text:
             booken) {
            System.out.println(text);
        }

        di.finishImport();
    }
}
