package fileworks;

import java.io.*;
import java.util.Random;

public class Multiples {

    static double loadFiles(String filePath){
        double sum = 0;
        double amount = 0;
        BufferedReader br = null;

            for (int i = 0; i < 10; i++) {
                try {
                    br = new BufferedReader(new FileReader(filePath + (i+1) +".txt"));
                    String line;
                    while((line = br.readLine()) != null){
                        sum += Double.parseDouble(line);
                        amount++;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }

        return sum/amount;
    }

    static void createFiles(String filePath, int min, int max, int count){
        PrintWriter pw = null;
        int random;
//        Random r = new Random();

        try {
            for (int i = 0; i < count; i++) {
                pw = new PrintWriter(new BufferedWriter(new FileWriter(filePath+ (i+1) + ".txt")));

                for (int e = 0; e < 10_000; e++) {
                    random = (int) (Math.random()*(max - min+1) + min);

                    pw.println(random);
                }

                pw.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }



    public static void main(String[] args) {
        createFiles("Outputs\\sequence", 0, 10_000,10);
        System.out.println("Average value: " + loadFiles("Outputs\\sequence"));
    }
}
