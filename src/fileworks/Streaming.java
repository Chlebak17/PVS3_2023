package fileworks;

import java.io.*;
import java.util.Scanner;

public class Streaming {
    static String path = "Outputs\\output.txt";
    public static void main(String[] args) {


        try {
            InputStream is = new FileInputStream(path);
            InputStreamReader ir = new InputStreamReader(is);

            System.out.println("Muzu cist: " + ir.ready());
            System.out.println("Kodovani: " + ir.getEncoding());

//            int read = is.read();
//            while (read != -1){
//                char charecter = (char) read;
//                System.out.print(charecter);
//                read = is.read();
//            }
//            is.close();
            int readed = ir.read();
            while (readed != -1){
                char chart = (char) readed;
                System.out.print(chart);
                readed = ir.read();
            }
            ir.close();

            FileOutputStream fl = new FileOutputStream("Outputs\\fromFOS.txt");
            OutputStreamWriter outSW = new OutputStreamWriter(fl);
            fl.write(0);
            fl.write('4');


            outSW.close();
            fl.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
