//package simpleShits;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//
//public class MatrixPaintSimpleGame extends JFrame {
//    Color DEFAULT_BG = Color.white;
//    Color MOUSE_OVER_BG = Color.CYAN;
//
//    int number = 0;
//
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setSize(800, 800);
//
//        this.setLayout(new BorderLayout());
//
//        JPanel panel = new JPanel();
//
//        panel.setLayout(new GridLayout(10, 10, 3,3));
//        JLabel topLabel = new JLabel("TOP");
//        topLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        topLabel.setFont(new Font("Consolas", Font.BOLD,32));
//
//        this.add(topLabel, BorderLayout.NORTH);
//        this.add(panel, BorderLayout.CENTER);
//
//
//
//
//        for (int i = 1; i <= 100 ; i++) {
//            JLabel label = new JLabel(String.valueOf(i));
//            label.setHorizontalAlignment(SwingConstants.CENTER);
//            label.setFont(new Font("Consolas", Font.BOLD,18));
//            label.setBorder(BorderFactory.createLineBorder(Color.black, 3));
//            label.setOpaque(true);
//            label.setPreferredSize(new Dimension(100, 50));
//            label.setBackground(Color.white);
//            label.addMouseListener(new MouseListener() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//
//                }
//
//                @Override
//                public void mousePressed(MouseEvent e) {
//
//                }
//
//                @Override
//                public void mouseReleased(MouseEvent e) {
//
//                }
//
//                @Override
//                public void mouseEntered(MouseEvent e) {
//                    if (label.getBackground().equals(DEFAULT_BG)) {
//                        number++;
//                    }
//                    label.setBackground(MOUSE_OVER_BG);
//                    if (number == 100) {
//                        topLabel.setText("Full");
//                    }
//                }
//
//                @Override
//                public void mouseExited(MouseEvent e) {
////                    label.setBackground(DEFAULT_BG);
//                }
//            });
//
//            panel.add(label);
//
//        }
//
//
//
//
//
//    public static void main(String[] args) {
//        new gui.components.MatrixPaintSimple().setVisible(true);
//    }
//}
//
