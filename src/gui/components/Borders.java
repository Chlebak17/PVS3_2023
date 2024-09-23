package gui.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Borders extends JFrame {
    public Borders(){
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


        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,200));
        panel3.setPreferredSize(new Dimension(100,40));
        panel4.setPreferredSize(new Dimension(100,40));

        JButton button1 = new JButton("ROTATE");
        button1.setFocusable(false);
        button1.setFont(new Font("consolas",Font.PLAIN,40));
        button1.addActionListener(new ActionListener() {
            Color c1,c2,c3,c4;

            @Override
            public void actionPerformed(ActionEvent e) {

                c1 = panel1.getBackground();
                c2 = panel2.getBackground();
                c3 = panel3.getBackground();
                c4 = panel4.getBackground();

                panel1.setBackground(c4);
                panel2.setBackground(c1);
                panel3.setBackground(c2);
                panel4.setBackground(c3);

            }
        });

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.EAST);
        this.add(panel3, BorderLayout.SOUTH);
        this.add(panel4,BorderLayout.WEST);
        this.add(button1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Borders().setVisible(true);
    }
}
