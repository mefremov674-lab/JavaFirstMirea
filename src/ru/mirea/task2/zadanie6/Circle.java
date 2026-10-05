package ru.mirea.task2.zadanie6;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double ploshad() {
        return Math.PI * radius * radius;
    }

    public double dlina() {
        return 2 * Math.PI * radius;
    }

    public int sravnit(Circle drugaya) {
        if (this.radius > drugaya.radius) {
            return 1;
        } else if (this.radius < drugaya.radius) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Окружность: центр (" + x + ", " + y + "), радиус " + radius;
    }
}