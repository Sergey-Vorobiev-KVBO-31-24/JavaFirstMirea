package ru.mirea.task2;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    @Override
    public String toString()
    {
        return String.format("Движущаяся точка {x: %d, y: %d, xSpeed: %d, ySpeed: %d}", x, y, xSpeed, ySpeed);
    }

    public void moveUp()
    {
        y += ySpeed;
    }

    public void moveDown()
    {
        y -= ySpeed;
    }

    public void moveLeft()
    {
        x -= xSpeed;
    }

    public void moveRight()
    {
        x += xSpeed;
    }
}
