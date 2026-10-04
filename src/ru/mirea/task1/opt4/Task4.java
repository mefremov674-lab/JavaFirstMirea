package ru.mirea.task1.opt4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите количество элементов: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Сумма через while
        int sum1 = 0;
        int i = 0;
        while (i < n) {
            sum1 += arr[i];
            i++;
        }

        // Сумма через do while
        int sum2 = 0;
        int j = 0;
        do {
            sum2 += arr[j];
            j++;
        } while (j < n);

        // Максимум и минимум
        int max = arr[0];
        int min = arr[0];
        for (int k = 1; k < n; k++) {
            if (arr[k] > max) max = arr[k];
            if (arr[k] < min) min = arr[k];
        }

        System.out.println("Сумма (while): " + sum1);
        System.out.println("Сумма (do while): " + sum2);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}