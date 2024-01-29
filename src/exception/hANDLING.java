package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hANDLING {

    static void printArray(int[] arr) throws ArrayIndexOutOfBoundsException{
        //odchyceno pri vytvoru
//        try{
//            System.out.println(arr[1]);
//        }catch (ArrayIndexOutOfBoundsException o){
//            System.out.println("/D");
//        }
//        //System.out.println(arr[1]);
         FileReader fr = new FileReader("neco.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            //odchyceno v nejnizsim bode
            int[] arr = {1,3,4,8,7};
            printArray(arr);
            int[] arr2 = {1};
            printArray(arr2);

        }catch (ArrayIndexOutOfBoundsException hihi){
            System.out.println(":D");
        }


    }
}
