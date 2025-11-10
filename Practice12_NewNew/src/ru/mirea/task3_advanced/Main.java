package ru.mirea.task3_advanced;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String animPackPath = "src/ru/mirea/task3_advanced/animPack";
        String animName;
        int frameCount;

        JFrame frame = new JFrame("Моя гифка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 720);

        MyAnimationPanel panel = new MyAnimationPanel(animPackPath, animName, frameCount);
        panel.setBackground(Color.BLACK);
        panel.setLayout(new BorderLayout());

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}