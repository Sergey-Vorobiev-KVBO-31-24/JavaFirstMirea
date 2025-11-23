package ru.mirea.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    JComboBox<Countries> box = new JComboBox<>(Countries.values());
    JLabel square = new JLabel("Площадь:", SwingConstants.CENTER);
    JLabel population = new JLabel("Население:", SwingConstants.CENTER);
    JLabel gdp = new JLabel("ВВП:", SwingConstants.CENTER);

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Немного про страны");
        frame.setSize(300,300);

        MyPanel panel = new MyPanel();
        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }

    public MyPanel() {
        super();
        setLayout(new GridLayout(2, 1));

        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Countries country = (Countries)box.getSelectedItem();
                square.setText("Плошадь: " + country.getSquare() + " млн.кв.км^2");
                population.setText("Население: " + country.getPopulation() + " млн.");
                gdp.setText("ВВП: " + country.getGdp() + " трлн.$");
            }
        });

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 1));
        panel2.add(square);
        panel2.add(population);
        panel2.add(gdp);

        add(box);
        add(panel2);
    }
}
