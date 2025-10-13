package ru.mirea.task2;

public class MovableRectangle implements Movable {
    MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString()
    {
        return String.format("Движущийся прямоугольник \n[Верхняя левая точка - %s\nНижняя правая точка - %s]", topLeft.toString(), bottomRight.toString());
    }

    private boolean checkXSpeeds()
    {
        return topLeft.getXSpeed() == bottomRight.getXSpeed();
    }

    private boolean checkYSpeeds()
    {
        return topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    public void moveUp()
    {
        if (this.checkYSpeeds()) {topLeft.moveUp(); bottomRight.moveUp();}
    }

    public void moveDown()
    {
        if (this.checkYSpeeds()) {topLeft.moveDown(); bottomRight.moveDown();}
    }

    public void moveLeft()
    {
        if (this.checkXSpeeds()) {topLeft.moveLeft(); bottomRight.moveLeft();}
    }

    public void moveRight()
    {
        if (this.checkXSpeeds()) {topLeft.moveRight(); bottomRight.moveRight();}
    }
}
