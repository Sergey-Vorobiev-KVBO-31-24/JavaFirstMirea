package ru.mirea.task1.myShapes;

import ru.mirea.task1.MyShape;

import java.awt.*;

public class HighOval extends MyShape {
    public HighOval(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2, 25, 50);
    }

    public void paintYourself(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
