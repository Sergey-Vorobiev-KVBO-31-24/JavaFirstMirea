package ru.mirea.task3_advanced;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListener implements ActionListener {
    protected MyAnimationPanel panel;

    public MyButtonListener(MyAnimationPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand())
        {
            case "Ускорить на 100 мс":
            {
                panel.timerChangeDelay(-100);
                break;
            }
            case "Замедлить на 100 мс":
            {
                panel.timerChangeDelay(100);
                break;
            }
        }
    }
}