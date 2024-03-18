package fileworks;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Appending {
    public static void main(String[] args) {
        String path = "Outputs\\output.txt";
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path)));
            pw.println("ahoj kamo");
            pw.println(164);
            pw.append("CAU");
            pw.close();
            pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
            pw.println("AHOj svwtě");
            pw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
