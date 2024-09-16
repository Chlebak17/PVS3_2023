package gui.Basic;

import javax.swing.*;
import java.io.File;

public class Options {


    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }

//        String s = JOptionPane.showInputDialog("Zadej to:");
//        System.out.println("Zadáno: " + s);

//        int answer = JOptionPane.showConfirmDialog(null,
//                "Uzavrena otazka",
//                "nejaky titulek",
//                JOptionPane.YES_NO_OPTION);

//        JOptionPane.showMessageDialog(null,
//                "Uzitecna zprava",
//                "Titulek",
//                JOptionPane.WARNING_MESSAGE);

        JFileChooser f = new JFileChooser();
        int code = f.showOpenDialog(null);



//        System.out.println("Kod je: " + code);
//        System.out.println("Zadaná cesta je: " + f.getSelectedFile());

    }



}
