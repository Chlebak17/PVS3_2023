package gui.components;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonControl extends JFrame {
    public ButtonControl(){
        Font font1 = new Font("Consolas", Font.BOLD,28);

        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,800);

        JLabel label1 = new JLabel("Secret");
        JButton button1 = new JButton("TLačildlo");

        label1.setFont(new Font("Consolas", Font.BOLD,28));
        label1.setForeground(new Color(0,0,0));
        label1.setBounds(100,200,300,80);
        label1.setBorder(BorderFactory.createEtchedBorder());
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setBackground(Color.white);
        label1.setOpaque(true);


        button1.setText("HIDE");
        button1.setBounds(150,280,200,50);
        button1.setFocusable(false);
        button1.setFont(font1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (label1.getBackground().equals(Color.WHITE)) {
                    label1.setBackground(new Color(0,0,0));
                    button1.setText("SHOW");
                }else {
                    label1.setBackground(Color.white);
                    button1.setText("HIDE");
                }
            }
        });


        this.add(label1);
        this.add(button1);

    }

    public static void main(String[] args) {
        new  ButtonControl().setVisible(true);
    }
}
