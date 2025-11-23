package ru.mirea.task1;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton btn1 = new JButton("Сложить");
    JButton btn2 = new JButton("Вычесть");
    JButton btn3 = new JButton("Умножить");
    JButton btn4 = new JButton("Разделить");
    Font fnt = new Font("Times new roman", Font.BOLD,20);

    LabExample(){
        super("Калькулятор, версия 2");
        setLayout(new FlowLayout());
        setSize(250,180);

        add(new JLabel("1-ое число"));
        add(jta1);

        add(new JLabel("2-ое число"));
        add(jta2);

        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);

        ActionListener listener = new ActionListener() {
            public double perform(ActionEvent e, double x1, double x2)
            {
                return switch (e.getActionCommand())
                {
                    case "+" -> x1+x2;
                    case "-" -> x1-x2;
                    case "*" -> x1*x2;
                    case "/" -> x1/x2;
                    default -> -1;
                };
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());

                    if (e.getActionCommand().equals("/") && x2 == 0)
                    {
                        JOptionPane.showMessageDialog(null,
                                "Деление на нуль не определено!",
                                "Ошибка",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    JOptionPane.showMessageDialog(null,
                            "Результат: " + perform(e, x1, x2),
                            "Результат",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception exc) {
                    JOptionPane.showMessageDialog(null,
                            "Предоставлено не число!",
                            "Ошибка",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        btn1.addActionListener(listener);
        btn2.addActionListener(listener);
        btn3.addActionListener(listener);
        btn4.addActionListener(listener);

        btn1.setActionCommand("+");
        btn2.setActionCommand("-");
        btn3.setActionCommand("*");
        btn4.setActionCommand("/");

        setVisible(true);
    }

    public static void main(String[] args) {
        new LabExample();
    }
}