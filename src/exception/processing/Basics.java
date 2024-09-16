package exception.processing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Basics {
    //throw do řádku
    //throws do hlavičky
    static void doSometingg() throws IOException{
        throw new IOException();
    }
    //Exception = vznikne za běhu
    //Error = vyhladoví paměť stack,heap
    static void dodoSometing()throws IOException{
        doSometingg();
    }
    public static void main(String[] args) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\jakub.matas\\IdeaProjects\\PVS3_2023\\src\\exception\\processing\\inputs.txt"));
            System.out.println(lines);
            String[] params;
            double a,b;
            for (String s : lines){
                try {
                params = s.split(",");
                a = Double.parseDouble(params[0]);
                b= Double.parseDouble(params[1]);

                    switch (params[2]) {
                        case "A":
                            System.out.println(a + b);
                            break;
                        case "S":
                            System.out.println(a - b);
                            break;
                        case "M":
                            System.out.println(a * b);
                            break;
                        case "D":
                            System.out.println(a / b);
                            break;

                    }
                }catch (ArithmeticException e){
                    System.out.println("Nelze dělit nulou");
                }catch (NumberFormatException nfe){
                    System.out.println(nfe);
                }catch (ArrayIndexOutOfBoundsException aiobe){
                    System.out.println(aiobe);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
