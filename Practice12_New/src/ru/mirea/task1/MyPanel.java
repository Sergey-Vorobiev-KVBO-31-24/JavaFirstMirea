package ru.mirea.task1;

import javax.swing.*;
import java.awt.*;

import java.util.Random;
import ru.mirea.task1.myShapes.*;

public class MyPanel extends JPanel {
    private static Random shapeRandomizer = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        MyShape shape;

        final int count = 20;
        for (int i=0; i < count; i++)
        {
            shape = randomShape(0, 0, this.getWidth(), this.getHeight());
            shape.paintYourself(g);
        }
    }

    private static MyShape randomShape(int x1, int y1, int x2, int y2)
    {
        final int shapeTypes = 7;

        return switch (shapeRandomizer.nextInt(shapeTypes))
        {
            case 0 -> new Circle(x1, y1, x2, y2);
            case 1 -> new HighOval(x1, y1, x2, y2);
            case 2 -> new HighRectangle(x1, y1, x2, y2);
            case 3 -> new Square(x1, y1, x2, y2);
            case 4 -> new Triangle(x1, y1, x2, y2);
            case 5 -> new WideOval(x1, y1, x2, y2);
            default -> new WideRectangle(x1, y1, x2, y2);
        };
    }
}
