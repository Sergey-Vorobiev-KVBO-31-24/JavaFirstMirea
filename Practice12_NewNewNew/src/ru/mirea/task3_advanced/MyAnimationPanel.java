package ru.mirea.task3_advanced;

import javax.swing.*;
import java.awt.*;

public class MyAnimationPanel extends JPanel {
    protected String animName;
    protected int frameCount;

    protected int currentFrame = 0;
    protected JLabel delayLabel, imageLabel;
    protected Timer timer;

    public MyAnimationPanel(String animName, int frameCount) {
        this.animName = animName;
        this.frameCount = frameCount;


        setBackground(Color.BLACK);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ImageIcon img = new ImageIcon("src/ru/mirea/task3_advanced/animPack/" + animName + "_0.png");
        imageLabel = new JLabel(img, SwingConstants.CENTER);
        add(imageLabel);

        timer = new Timer(1000, new MyTimerListener(this));
        timer.start();


        MyButtonListener listener = new MyButtonListener(this);

        JButton btn1 = new JButton("Ускорить на 100 мс");
        btn1.setActionCommand("Ускорить на 100 мс");
        btn1.addActionListener(listener);
        add(btn1);

        JButton btn2 = new JButton("Замедлить на 100 мс");
        btn2.setActionCommand("Замедлить на 100 мс");
        btn2.addActionListener(listener);
        add(btn2);

        delayLabel = new JLabel("Текущая задержка между кадрами: 1000 мс");
        delayLabel.setForeground(Color.GREEN);
        add(delayLabel);
    }

    public void animGo()
    {
        currentFrame++;
        if (currentFrame == frameCount) currentFrame = 0;

        ImageIcon img = new ImageIcon("src/ru/mirea/task3_advanced/animPack/" + animName + "_" + currentFrame + ".png");
        imageLabel.setIcon(img);
    }

    public void timerChangeDelay(int change)
    {
        if (change > 0 || timer.getDelay() > 100) timer.setDelay(timer.getDelay() + change);
        delayLabel.setText(String.format("Текущая задержка между кадрами: %d", timer.getDelay()));
    }
}