
package ru.mirea.task1.myShapes;

import ru.mirea.task1.MyShape;

import java.awt.*;

public class Triangle extends MyShape {
    public Triangle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2, 50, 50);
    }

    public void paintYourself(Graphics g)
    {
        g.setColor(color);
        int[] angleX = {x, x+width, x};
        int[] angleY = {y, y, y+height};
        g.fillPolygon(angleX, angleY, 3);
    }
}