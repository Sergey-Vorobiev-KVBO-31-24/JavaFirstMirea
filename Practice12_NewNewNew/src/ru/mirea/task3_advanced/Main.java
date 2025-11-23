package ru.mirea.task3_advanced;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String animName = "hexclock";
        int frameCount = 16;

        JFrame frame = new JFrame("Моя гифка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 480);

        MyAnimationPanel panel = new MyAnimationPanel(animName, frameCount);
        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}