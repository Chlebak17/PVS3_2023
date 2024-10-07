package gui.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ScreenSaver extends JFrame {

    Canvas panel,panel2;

    ScreenSaver(){
        panel = new Canvas("tChar.png");
        panel2 = new Canvas("ctChar.png");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);

       add(panel2);
        add(panel);

        pack();
    }

    public static void main(String[] args) {
        new ScreenSaver().setVisible(true);
    }
}
class Canvas extends JPanel implements ActionListener {
    final int CANVAS_WIDTH = 1000;
    final int CANVAS_HEIGHT = 1000;
    Image bouncing;
    Timer time;
    int x = 0;
    int y = 0;
    int xVelocity = 20;
    int yVelocity = 1;

    Canvas(String imgPath){
        this.setPreferredSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));
        this.setBackground(Color.black);
        bouncing = new ImageIcon(imgPath).getImage();
        time = new Timer(5,this);
        time.start();

    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(bouncing, x,y,null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (y >= CANVAS_HEIGHT-bouncing.getWidth(null) || y < 0) {
            yVelocity *= -1;
        }
        y = y + xVelocity;

        if (x >= CANVAS_HEIGHT-bouncing.getWidth(null) || x < 0) {
            xVelocity *= -1;
        }
        x = x + xVelocity;

        repaint();

    }
}