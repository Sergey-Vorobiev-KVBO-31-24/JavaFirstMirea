package ru.mirea.task3_advanced;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTimerListener implements ActionListener {
    protected MyAnimationPanel panel;

    public MyTimerListener(MyAnimationPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.animGo();
    }
}