package ru.mirea.task1;

import java.awt.*;
import java.util.Random;

public abstract class MyShape {
    protected int x, y, width, height;
    protected Color color;

    public MyShape(int x1, int y1, int x2, int y2, int width, int height) {
        Random random = new Random();

        x = random.nextInt(x1, x2-width);
        y = random.nextInt(y1, y2-height);

        this.width = width;
        this.height = height;

        Color[] colors = {Color.BLACK, Color.BLUE, Color.ORANGE, Color.PINK, Color.GREEN};
        color = colors[random.nextInt(colors.length)];
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    abstract public void paintYourself(Graphics g);
}
