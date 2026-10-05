package ru.mirea.task2.zadanie2;

public class TestBall {
    public static void main(String[] args) {
        Ball myach1 = new Ball(3.0, 4.0);
        Ball myach2 = new Ball();

        System.out.println("Первый мяч: " + myach1);
        System.out.println("Второй мяч: " + myach2);

        myach1.move(2.0, -1.5);
        System.out.println("Первый мяч после сдвига: " + myach1);

        myach2.setXY(10.0, 5.0);
        System.out.println("Второй мяч после setXY: " + myach2);

        myach2.setX(7.0);
        System.out.println("Второй мяч, x = " + myach2.getX() + ", y = " + myach2.getY());
    }
}