package gui.components;

import javax.swing.*;
import java.awt.*;

public class LabelBasics extends JFrame {

    public LabelBasics(){
        this.setSize(new Dimension(420,420));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Ukazka label component");

        this.setLayout(null);

        JLabel label = new JLabel();
        label.setText("tady je text");
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Consoas", Font.PLAIN,20));

        label.setOpaque(true);
        label.setBackground(new Color(0xB83A3A));
        label.setForeground(new Color(0));
        label.setBorder(BorderFactory.createLineBorder(new Color(0, 1, 80),5));

        label.setBounds(100,100,180,60);

        this.add(label);

    }

    public static void main(String[] args) {
        new LabelBasics().setVisible(true);

    }
}
