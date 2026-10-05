package ru.mirea.task7.zadanie2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean speedTest() {
        return topLeft.xSpeed == bottomRight.xSpeed
                && topLeft.ySpeed == bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "Прямоугольник: левая верхняя " + topLeft
                + "; правая нижняя " + bottomRight;
    }

    @Override
    public void moveUp() {
        if (proverka()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (proverka()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (proverka()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (proverka()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    private boolean proverka() {
        if (!speedTest()) {
            System.out.println("Скорости точек разные — прямоугольник не может двигаться");
            return false;
        }
        return true;
    }
}