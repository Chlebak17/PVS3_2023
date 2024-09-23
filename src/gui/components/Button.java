package gui.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame implements ActionListener{

    JButton button,onButton;

    public Button(){
        this.setSize(500,500);
        this.setTitle("Ukazka buttonu");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(null);

        button = new JButton();
        button.setText("OFF");
        button.setFont(new Font("Consolas", Font.BOLD,40));
        button.setFocusable(false);

//        Varianta 1
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button was pressed");
//            }
//        });

//        button.setEnabled(false);
        button.setBounds(130,50,200,170);
        button.setBackground(Color.magenta);
        button.setForeground(new Color(0x00ff00));

//        this.setBackground(new Color(0,0,255));
//        set.opacity()

        onButton = new JButton("CHANGE");
        onButton.setForeground(new Color(0xE01313));
        onButton.setFont(new Font("Consolas", Font.BOLD,40));
        onButton.setFocusable(false);


//        chci hodit button pod
//        y = y(off button) + výška(off Button)
        onButton.setBounds(130,280,200,170);

        button.addActionListener(this);
        onButton.addActionListener(this);

        this.add(button);
        this.add(onButton);
    }


    public static void main(String[] args) {
        new Button().setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == onButton) {
            System.out.println("button is disable");
            button.setEnabled(!button.isEnabled());

        }
        if (e.getSource() == button) {
            System.out.println("Button was pressed");
        }
    }
}
