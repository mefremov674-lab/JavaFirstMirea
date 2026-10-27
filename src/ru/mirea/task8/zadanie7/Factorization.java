package ru.mirea.task8.zadanie7;

import java.util.Scanner;

public class Factorization {

    public static void factorize(int n, int d) {
        // Базовый случай: раскладывать больше нечего
        if (n == 1) {
            return;
        }
        // Шаг рекурсии
        if (n % d == 0) {
            System.out.print(d + " ");
            factorize(n / d, d);      // делитель оставляем тем же
        } else {
            factorize(n, d + 1);      // пробуем следующий делитель
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n (n > 1): ");
        int n = sc.nextInt();
        factorize(n, 2);
    }
}
