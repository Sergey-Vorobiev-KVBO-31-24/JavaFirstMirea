package ru.mirea.task1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    int number = (new Random()).nextInt(21);
    int hp = 3;

    JTextField input = new JTextField(5);
    JButton btn = new JButton("Попытаться угадать");
    JLabel label = new JLabel(String.format("Осталось попыток: %d", hp), SwingConstants.CENTER);

    JFrame frame;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Числовой кудесник");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 240);
        frame.getContentPane().add(new MyPanel(frame));
        frame.setVisible(true);
    }

    public MyPanel(JFrame frame) {
        this.frame = frame;

        input.setFont(new Font("Times new roman", Font.BOLD, 25));

        setLayout(new GridLayout(3, 1));
        add(input);
        add(btn);
        add(label);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int prediction;
                try {
                    prediction = Integer.parseInt(input.getText().trim());
                }
                catch (Exception exc) {
                    JOptionPane.showMessageDialog(null,
                            "Предоставлено не число!",
                            "Ошибка",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (prediction < 0 || prediction > 20)
                {
                    JOptionPane.showMessageDialog(null,
                            "Мы предсказываем число от 0 до 20!",
                            "Ошибка",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (prediction > number) JOptionPane.showMessageDialog(null,
                        "К сожалению, Вы не угадали. Загаданное число МЕНЬШЕ чем " + prediction + ".",
                        "Жаль",
                        JOptionPane.INFORMATION_MESSAGE);
                else if (prediction < number) JOptionPane.showMessageDialog(null,
                        "К сожалению, Вы не угадали. Загаданное число БОЛЬШЕ чем " + prediction + ".",
                        "Жаль",
                        JOptionPane.INFORMATION_MESSAGE);
                else
                {
                    JOptionPane.showMessageDialog(null,
                        "Ура, вы угадали! Это действительно " + prediction + ". Победа!",
                        "Победа",
                        JOptionPane.PLAIN_MESSAGE);
                    frame.dispose();
                    return;
                }

                hp--;
                label.setText(String.format("Осталось попыток: %d", hp));

                if (hp == 0)
                {
                    JOptionPane.showMessageDialog(null,
                            "Онет, вы проиграли! У вас закончились попытки. Загаданное число было " + number + ".",
                            "Поражение",
                            JOptionPane.WARNING_MESSAGE);
                    frame.dispose();
                }
            }
        });
    }
}
