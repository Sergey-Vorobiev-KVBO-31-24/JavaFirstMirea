package ru.mirea.task1;

import javax.swing.*;
import java.awt.*;

public class Main {
    static void main() {
        JFrame frame = new JFrame("Football Match Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 360);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(25,150,25));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton btn1 = new JButton("AC Milan");
        panel.add(btn1);

        JButton btn2 = new JButton("Real Madrid");
        panel.add(btn2);

        JLabel label1 = new JLabel("Result: 0 X 0");
        panel.add(label1);

        JLabel label2 = new JLabel("Last Scorer: N/A");
        panel.add(label2);

        JLabel label3 = new JLabel("Winner: DRAW");
        panel.add(label3);

        MyButtons myButtons = new MyButtons();
        myButtons.setObjects(label1, label2, label3);
        btn1.setActionCommand("AC Milan гооол");
        btn2.setActionCommand("Real Madrid гооол");
        btn1.addActionListener(myButtons);
        btn2.addActionListener(myButtons);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}