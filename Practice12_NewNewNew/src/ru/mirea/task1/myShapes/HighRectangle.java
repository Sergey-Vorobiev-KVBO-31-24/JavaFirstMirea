package ru.mirea.task1.myShapes;

import ru.mirea.task1.MyShape;

import java.awt.*;

public class HighRectangle extends MyShape {
    public HighRectangle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2, 25, 50);
    }

    public void paintYourself(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
