package ru.mirea.task7.zadanie2;

public class RectangleTest {
    public static void main(String[] args) {
        // Прямоугольник с одинаковой скоростью точек
        MovableRectangle pryam1 = new MovableRectangle(1, 5, 4, 2, 2, 1);
        System.out.println(pryam1);
        System.out.println("Скорости одинаковые: " + pryam1.speedTest());

        pryam1.moveRight();
        System.out.println("После moveRight: " + pryam1);
        pryam1.moveUp();
        System.out.println("После moveUp: " + pryam1);

        // Прямоугольник из точек с разной скоростью
        System.out.println();
        MovablePoint tochka1 = new MovablePoint(0, 3, 1, 1);
        MovablePoint tochka2 = new MovablePoint(3, 0, 5, 1);
        MovableRectangle pryam2 = new MovableRectangle(tochka1, tochka2);
        System.out.println(pryam2);
        System.out.println("Скорости одинаковые: " + pryam2.speedTest());
        pryam2.moveLeft();
    }
}