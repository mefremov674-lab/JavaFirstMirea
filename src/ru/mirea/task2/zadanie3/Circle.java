package ru.mirea.task2.zadanie3;

public class Circle {
    private Point centr;
    private double radius;

    public Circle(Point centr, double radius) {
        this.centr = centr;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.centr = new Point(x, y);
        this.radius = radius;
    }

    public Point getCentr() {
        return centr;
    }

    public void setCentr(Point centr) {
        this.centr = centr;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Окружность: центр " + centr + ", радиус " + radius;
    }
}