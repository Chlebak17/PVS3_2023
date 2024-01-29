package exception;

import javax.swing.*;

public class Basic {
    public static void main(String[] args) {
       String a = JOptionPane.showInputDialog("Zadej to: ");
       int aNumber = Integer.parseInt(a);
       System.out.println(aNumber);

       int num = 0;

        try{
            String b = JOptionPane.showInputDialog("Zadej: ");
            int cislo = Integer.parseInt(b);
            System.out.println(cislo/num);
        }catch (Exception e){
            System.out.println("Chyba here");
            e.printStackTrace();
        }

    }
}
