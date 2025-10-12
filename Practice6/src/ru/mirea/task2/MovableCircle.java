package ru.mirea.task2;

public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return String.format("Движущийся круг с радиусом %d и центром %s", radius, center.toString());
    }

    public void moveUp()
    {
        center.moveUp();
    }

    public void moveDown()
    {
        center.moveDown();
    }

    public void moveLeft()
    {
        center.moveLeft();
    }

    public void moveRight()
    {
        center.moveRight();
    }
}

