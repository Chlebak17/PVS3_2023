package fileworks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TimeMeasurements {
    static String filePath = "nejakyFiles\\Lines.txt";
    static  void generateData(){
        DataExport de = new DataExport(filePath);
        for (int i = 0; i < 5_000_000; i++) {
            de.writeLine("Line " + (i+1));
        }
        de.finishExport();
    }

    public static void main(String[] args) throws IOException {
//       generateData();

//        System.out.println("FileReader:");
//        String[] bigArr = new String[5_000_000];
//        FileReader fr = new FileReader(filePath);
//        int reader = fr.read();
//        String line;
//        int counter = 0;
//        while (reader != 1){
//            line = "";
//            while ((char) reader != 13){
//                line += (char) fr.read();
//            }
//            bigArr[counter] = line;
//            counter++;
//        }
//
//        fr.close();

        FileReader fr = new FileReader(filePath);
        int reader = fr.read();
        long start = System.nanoTime();

        while (reader != -1){
            System.out.print((char) reader);
            reader = fr.read();
        }
        fr.close();
        long stop = System.nanoTime();
        long duration = stop-start;
        System.out.println("Tohle trvalo: " + duration);
    }
}
