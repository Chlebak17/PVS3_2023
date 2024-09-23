package gui.components;

import javax.swing.*;
import java.awt.*;

    public class BordersInserter extends JFrame {
        public BordersInserter(){
            this.setSize(700,700);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(new BorderLayout());


            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();
            JPanel panel5 = new JPanel();

            panel1.setBackground(Color.RED);
            panel2.setBackground(Color.GREEN);
            panel3.setBackground(Color.BLUE);
            panel4.setBackground(Color.PINK);
            panel5.setBackground(Color.MAGENTA);


            panel1.setPreferredSize(new Dimension(100,100));
            panel2.setPreferredSize(new Dimension(100,200));



            this.add(panel1, BorderLayout.NORTH);
            this.add(panel2, BorderLayout.SOUTH);
            this.add(panel3,BorderLayout.WEST);
            this.add(panel4, BorderLayout.CENTER);
            this.add(panel5, BorderLayout.EAST);

            JPanel panel6 = new JPanel();
            JPanel panel7 = new JPanel();
            JPanel panel8 = new JPanel();
            JPanel panel9 = new JPanel();


            panel6.setPreferredSize(new Dimension(50,50));
            panel7.setPreferredSize(new Dimension(50,50));
            panel8.setPreferredSize(new Dimension(50,50));
            panel9.setPreferredSize(new Dimension(50,50));

            panel6.setBackground(Color.GRAY);
            panel7.setBackground(Color.DARK_GRAY);
            panel8.setBackground(Color.lightGray);
            panel9.setBackground(Color.black);

            this.add(panel6, BorderLayout.EAST);
            this.add(panel7,BorderLayout.WEST);
            this.add(panel8,BorderLayout.NORTH);
            this.add(panel9, BorderLayout.SOUTH);


        }


        public static void main(String[] args) {
            new gui.components.Borders().setVisible(true);
        }
    }


