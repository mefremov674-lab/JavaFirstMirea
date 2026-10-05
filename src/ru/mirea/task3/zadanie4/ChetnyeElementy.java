package ru.mirea.task3.zadanie4;

import java.util.Random;
import java.util.Scanner;

public class ChetnyeElementy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.print("Введите натуральное число n: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Число должно быть больше 0");
                }
            } else {
                System.out.println("Это не целое число");
                sc.next();
            }
        }

        Random sluchay = new Random();
        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i] = sluchay.nextInt(n + 1);
        }
        System.out.print("Исходный массив: ");
        pokazat(massiv);

        int skolkoChetnyh = 0;
        for (int i = 0; i < n; i++) {
            if (massiv[i] % 2 == 0) {
                skolkoChetnyh++;
            }
        }

        if (skolkoChetnyh == 0) {
            System.out.println("Чётных элементов нет");
        } else {
            int[] chetnye = new int[skolkoChetnyh];
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (massiv[i] % 2 == 0) {
                    chetnye[k] = massiv[i];
                    k++;
                }
            }
            System.out.print("Чётные элементы: ");
            pokazat(chetnye);
        }
    }

    public static void pokazat(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
    }
}