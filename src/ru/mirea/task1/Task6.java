package ru.mirea.task1;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int n = 1; n <= 10; n++) {
            double t = 1.0 / n;
            System.out.printf("%2d) 1/%-2d = %.4f%n", n, n, t);
        }
    }
}