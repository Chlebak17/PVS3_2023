package streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Alexander","Bob","Charlie","NoName");
        names.forEach(name -> System.out.println(name));

        System.out.println("-----");

        List<String> aNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        aNames.forEach(name -> System.out.println(name));

        System.out.println("-----");

        List<String> NAMES = names.stream()
                .map(name -> name.toUpperCase())
                .toList();
        NAMES.forEach(name -> System.out.println(name));

        System.out.println("-----");

        names.forEach(name -> System.out.println(name));

        String allNames = names.stream()
                .collect(Collectors.joining(","));

        System.out.println("-----");
        System.out.println(allNames);
    }
}
