package oop.collections.mapping;

import java.util.HashMap;
import java.util.Map;

public class Basics {

    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("USA","Washington DC");
        countries.put("Iceland","Reykjavik");
        countries.put("France","Paris");
        countries.put("Germany","Berlin");

        System.out.println(countries.getOrDefault("Germany","Country not found"));
        countries.remove("France");
        System.out.println(countries);

//        countries.clear();
        System.out.println(countries.size());
        for (String country: countries.keySet()){
            System.out.println(country);
            System.out.println(countries.get(country));
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() +" and town is : " + entry.getValue());
        }

        double avgNameLenght = countries.values().stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.println(avgNameLenght);


    }
}
