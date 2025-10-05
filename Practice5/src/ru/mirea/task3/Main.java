package ru.mirea.task3;

import javax.swing.*;
import java.awt.*;

public class Main {
    static void main(String[] args) {
        JFrame frame = new JFrame("Image Output Task");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 480);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BorderLayout());

        ImageIcon img = new ImageIcon(args[0]);
        JLabel label = new JLabel(img, SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}