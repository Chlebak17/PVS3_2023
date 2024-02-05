package fileworks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    //co a jak používat pro r§zné čtení souborů

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("nejakyFiles\\text.txt");
        int read = fr.read();
        while (read != -1){
            System.out.print((char) read);
            read = fr.read();
        }
        fr.close();



    }
}
