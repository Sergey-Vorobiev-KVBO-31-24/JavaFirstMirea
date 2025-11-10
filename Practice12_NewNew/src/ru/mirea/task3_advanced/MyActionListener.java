package ru.mirea.task3_advanced;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {
    protected JLabel label;

    public MyActionListener(JLabel label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
