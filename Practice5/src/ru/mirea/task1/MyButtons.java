package ru.mirea.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtons implements ActionListener {
    int score1 = 0;
    int score2 = 0;

    JLabel label1;
    JLabel label2;
    JLabel label3;

    public void setObjects(JLabel label1, JLabel label2, JLabel label3)
    {
        this.label1 = label1;
        this.label2 = label2;
        this.label3 = label3;
    }

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        switch (command)
        {
            case "AC Milan гооол":
            {
                score1++;
                label2.setText("Last Scorer: AC Milan");
                break;
            }
            case "Real Madrid гооол":
            {
                score2++;
                label2.setText("Last Scorer: Real Madrid");
                break;
            }
        }

        label1.setText(String.format("Result: %s X %s", score1, score2));

        if (score1 > score2) label3.setText("Winner: AC Milan");
        else if (score1 < score2) label3.setText("Winner: Real Madrid");
        else label3.setText("Winner: DRAW");
    }
}
