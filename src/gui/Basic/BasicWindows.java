package gui.Basic;

import javax.swing.*;
import java.awt.*;
import java.awt.image.AbstractMultiResolutionImage;

public class BasicWindows {
    //TAKHLE SE UI V JAVA NEDĚLÁ
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
//        frame.setResizable(false);

        frame.setLocationRelativeTo(null);
        frame.setTitle("Titulek");

        //frame.setIconImage();

        frame.setVisible(true);
    }
}
