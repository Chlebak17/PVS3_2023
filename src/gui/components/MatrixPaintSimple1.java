package gui.components;

import javax.swing.*;
import java.awt.*;

public class MatrixPaintSimple1 extends JFrame {

    public MatrixPaintSimple1(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 800);

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10,10));

        JLabel topLabel = new JLabel("TOP");

        this.add(topLabel, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);

        for (int i = 1; i <= 100; i++) {
            JLabel label1 = new JLabel(String.valueOf(i));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setFont(new Font("Consolas",Font.BOLD,45));
            label1.setBackground(new Color(158,89,189));
            label1.setPreferredSize(new Dimension(100,100));

            this.add(label1);
        }

    }

    public static void main(String[] args) {
        new MatrixPaintSimple1().setVisible(true);
    }
}
