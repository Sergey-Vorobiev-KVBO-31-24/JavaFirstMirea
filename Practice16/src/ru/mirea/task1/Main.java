package ru.mirea.task1;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Числовой кудесник");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 240);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setLayout(new FlowLayout());

        JTextField input = new JTextField(5);
        input.setFont(new Font("Times new roman", Font.BOLD, 25));
        panel.add(input);

        JButton btn = new JButton("Попытаться угадать");
        panel.add(btn);

        int hp = 3;
        JLabel label = new JLabel(String.format("Осталось попыток: %d", hp));
        panel.add(label);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                switch (command)
                {
                    case "Кнопка":
                    {

                        break;
                    }
                    case ""
                }
            }
        };

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
