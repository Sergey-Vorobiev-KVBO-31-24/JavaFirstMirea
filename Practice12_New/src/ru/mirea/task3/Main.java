package ru.mirea.task3;

import javax.swing.*;
import java.awt.*;

public class Main {
    static void main(String[] args) {
        String gifPath = "src/ru/mirea/task3/Seven_segment_display-animated.gif";

        JFrame frame = new JFrame("Моя гифка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 720);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new BorderLayout());

        ImageIcon img = new ImageIcon(gifPath);
        JLabel label = new JLabel(img, SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}