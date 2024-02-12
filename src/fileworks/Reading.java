package fileworks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Reading {
    //co a jak používat pro r§zné čtení souborů

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "nejakyFiles\\text.txt";
        FileReader fr = new FileReader("nejakyFiles\\text.txt");
        int read = fr.read(); //čte v ascii proto vrací int
        while (read != -1){
            System.out.print((char) read);
            read = fr.read();
        }
        fr.close();

        String text = "nejky)text)pro)scanner";
        Scanner sc = new Scanner(text);//užitečný když máme data c jednom datovým typu
        //nebo když chci z textu získat pouze dat typy
        sc.useLocale(Locale.US);
        sc.useDelimiter("\\)"); // znak \\ symbolizuje že přijde neznamy znak
        while (sc.hasNext()){
            System.out.println(sc.next());// sc.next bere odratkovani podle mezer

        }
        sc.close();
        System.out.println(" ");
        //buffering:
        //předčítá postupně
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String line = "";
        while ((line = br.readLine()) != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();


        //useful: oldie goldie
        //vátí nám to list se všemi řádkami
        System.out.println("ALL Lines");
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        System.out.println(lines);
        for (String s:
             lines) {
            System.out.println(s);
        }
    }
}
