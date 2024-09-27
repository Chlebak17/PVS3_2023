package gui.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MatrixPaintSimple extends JFrame {
    Color DEFAULT_BG = Color.white;
    Color MOUSE_OVER_BG = Color.CYAN;
    static Mylabel clickedLabel = null;


    public MatrixPaintSimple(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 800);

        this.setLayout(new BorderLayout());

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(10, 10, 3,3));
        JLabel topLabel = new JLabel("TOP");
        topLabel.setHorizontalAlignment(SwingConstants.CENTER);
        topLabel.setFont(new Font("Consolas", Font.BOLD,32));

        this.add(topLabel, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);




        for (int i = 1; i <= 100 ; i++) {
           Mylabel label = new Mylabel(String.valueOf(i));
            panel.add(label);

        }


    }


    public static void main(String[] args) {
        new MatrixPaintSimple().setVisible(true);
    }
}
class Mylabel extends JLabel{
    Color DEFAULT_BG = Color.white;
    Color MOUSE_OVER_BG = Color.magenta;
    Color CLICK_BG = Color.cyan;
    boolean clicked = false;
    public Mylabel(String text){
        super(text);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("Consolas", Font.BOLD,18));
        this.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(100, 50));
        this.setBackground(DEFAULT_BG);
//        Mylabel reference = this;
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (MatrixPaintSimple.clickedLabel != null) {

                }
                setBackground(CLICK_BG);
                clicked = true;
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(MOUSE_OVER_BG);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (Mylabel.this != MatrixPaintSimple.clickedLabel)
                    setBackground(DEFAULT_BG);
            }
        });

    }
}