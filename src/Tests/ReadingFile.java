package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFile {

    public static int FileSentencesCount(List<String> lines) {
        int wordCount = 0;
        for (String s: lines){
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    wordCount++;
                }
            }
        }
        return wordCount;
    }
    public static int FilewordCount(List<String> lines){
        int wordCount = 0;
        for (String s : lines) {
            String[] sentences = s.split(" ");
            wordCount++;
        }
        return wordCount;
    }
    public static int FileCharCount(List<String> lines){
        int wordCount = 0;
        for (String s : lines) {
            String[] arr = s.split(" ");
            for (int i = 0; i < arr.length; i++) {
                wordCount += arr[i].length();
            }
        }
        return wordCount;
    }
    public static void main(String[] args) throws IOException {
        String filePath = "nejakyFiles/text.txt";

        List<String> lines = Files.readAllLines(Paths.get(filePath));
//        System.out.println(lines);
        String[] sentences;
        String[] words;

        System.out.println("");
        System.out.println("Wordcount: "   + FilewordCount(lines));
        System.out.println("Characters: "  + FileCharCount(lines));
        System.out.println("Sentences: "  + FileSentencesCount(lines));
    }
}
