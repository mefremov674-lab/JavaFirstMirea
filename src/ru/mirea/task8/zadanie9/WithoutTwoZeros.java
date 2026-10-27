package ru.mirea.task8.zadanie9;

import java.util.Scanner;

public class WithoutTwoZeros {

    public static int count(int a, int b) {
        // Базовый случай 1: нулей нет, есть ровно одна последовательность из единиц
        if (a == 0) {
            return 1;
        }
        // Базовый случай 2: единиц нет, нули некому разделять
        if (b == 0) {
            if (a == 1) {
                return 1;
            }
            return 0;
        }
        // Шаг рекурсии: начинаем с "1" или с "01"
        return count(a, b - 1) + count(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите a (количество нулей): ");
        int a = sc.nextInt();
        System.out.print("Введите b (количество единиц): ");
        int b = sc.nextInt();

        System.out.println(count(a, b));
    }
}