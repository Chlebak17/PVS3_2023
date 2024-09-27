package gui.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mousing extends JFrame {

    public Mousing(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,700);
        this.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel();
        this.setLayout(null);
        panel1.setBounds(100,100,350,500);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

//                panel1.setBackground(Color.BLUE);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                panel1.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                panel1.setBackground(Color.GREEN);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel1.setBackground(Color.orange);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel1.setBackground(Color.gray);
            }
        });

        this.add(panel1);

    }

    public static void main(String[] args) {
        new Mousing().setVisible(true);
    }
}
