package gui.components;

import javax.swing.*;
import java.awt.*;

public class Grid extends JFrame {

    public Grid(){
        this.setSize(700,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        this.setLayout(new GridLayout(5,5));

        for (int i = 1; i <= 25; i++) {
            JLabel label1 = new JLabel(String.valueOf(i));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Consolas",Font.BOLD,45));
            label1.setBackground(new Color(158,89,189));
            label1.setPreferredSize(new Dimension(100,100));

            this.add(label1);
        }
    }
    public static void main(String[] args) {
        new Grid().setVisible(true);
    }
}
