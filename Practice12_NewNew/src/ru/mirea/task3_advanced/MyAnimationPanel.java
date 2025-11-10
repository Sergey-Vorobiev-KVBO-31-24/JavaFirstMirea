package ru.mirea.task3_advanced;

import javax.swing.*;
import java.awt.*;

public class MyAnimationPanel extends JPanel {
    protected MyActionListener listener;
    protected Timer timer;

    public MyAnimationPanel(String animPackPath, String animName, int frameCount) {
        ImageIcon img = new ImageIcon(animPackPath + "/" + animName + "_0.png");
        JLabel label = new JLabel(img, SwingConstants.CENTER);
        this.add(label, BorderLayout.CENTER);

        listener = new MyActionListener(label);
        timer = new Timer(1000, listener);
        timer.start();
    }
}
