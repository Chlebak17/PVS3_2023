package exception;

import java.io.BufferedOutputStream;
import java.util.ArrayList;

public class FavoriteError {
    static void infinity(){
        System.out.println("Infinity");
        infinity();
    }
    static ArrayList<String> strings = new ArrayList<>();

    static int countSaharaSandSeed(int a){
        if (a == Integer.MAX_VALUE) {
            return 42;
        }
        System.out.println("seed: " + a);
        a++;
        return countSaharaSandSeed(a);
    }

    static void crash(){
        for (int i = 0; i < Integer.MAX_VALUE; i++) {


            for (int j = 0; j < Integer.MAX_VALUE; j++) {

            }
        }
    }

    public static void main(String[] args) {
       // infinity();
        try{
            countSaharaSandSeed(1);
        }catch (StackOverflowError a){
            System.out.println("Happy dog");
        }
    }
}
