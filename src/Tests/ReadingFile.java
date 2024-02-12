package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFile {


    public static void main(String[] args) throws IOException {
        String filePath = "nejakyFiles/text.txt";

        List<String> lines = Files.readAllLines(Paths.get(filePath));
//        System.out.println(lines);
        int wordCount = 0;
        int characters = 0;
        int sentenc = 0;
        String[] sentences;

        String[] words;
        for (String s:
                lines) {

            sentences = s.split(".");
            for (int i = 0; i < sentences.length; i++) {
                sentenc++;
            }

            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.indexOf(i)) || Character.isDigit(s.indexOf(i))) {
                    characters++;
                }
            }
        }

        System.out.println("");
        System.out.println("Wordcount: "   + wordCount);
        System.out.println("Characters: "  + characters);
        System.out.println("Sentences: "  + sentenc);
    }
}
