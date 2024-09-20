package gui.components;

import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {

    public Button(){
        this.setSize(500,500);
        this.setTitle("Ukazka buttonu");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(null);

        JButton button = new JButton();
        button.setText("OFF");
        button.setFont(new Font("Consolas", Font.BOLD,40));
        button.setFocusable(false);

//        button.setEnabled(false);
        button.setBounds(130,50,200,170);
        button.setBackground(Color.magenta);
        button.setForeground(new Color(0x00ff00));

//        this.setBackground(new Color(0,0,255));
//        set.opacity()

        JButton onButton = new JButton("ON");
        onButton.setForeground(new Color(0xE01313));
        onButton.setFont(new Font("Consolas", Font.BOLD,40));
        onButton.setFocusable(false);


//        chci hodit button pod
//        y = y(off button) + výška(off Button)
        onButton.setBounds(130,280,200,170);



        this.add(button);
        this.add(onButton);
    }


    public static void main(String[] args) {
        new Button().setVisible(true);
    }
}
