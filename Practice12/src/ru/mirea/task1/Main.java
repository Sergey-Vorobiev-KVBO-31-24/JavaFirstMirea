package ru.mirea.task1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 480);

        MyPanel panel = new MyPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BorderLayout());



        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
