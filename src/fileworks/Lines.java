package fileworks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lines {
    static int lineCount(String filePath){
        int count = 0;
        BufferedReader br;
        try{
            br = new BufferedReader(new FileReader(filePath));
            String line;
            while (br.readLine() != null){
                count++;
            }
            br.close();
            List<String> strings = Files.readAllLines(Paths.get(filePath));

            FileReader fr = new FileReader(filePath);
            int takyCount = fr.read();

            while (takyCount != -1){
                if (takyCount == '\n') {
                    takyCount++;
                }
            }
            takyCount = fr.read();

            count = strings.size();
            return takyCount;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Line count: " + lineCount("resources\\ComparableMovies.txt"));
    }
}
