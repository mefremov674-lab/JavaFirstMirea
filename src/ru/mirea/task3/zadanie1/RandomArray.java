package ru.mirea.task3.zadanie1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int razmer = 8;

        // Способ 1: Math.random()
        double[] massiv1 = new double[razmer];
        for (int i = 0; i < razmer; i++) {
            massiv1[i] = Math.random() * 100;
        }
        System.out.println("Способ 1: Math.random()");
        System.out.print("До сортировки:    ");
        pokazat(massiv1);
        Arrays.sort(massiv1);
        System.out.print("После сортировки: ");
        pokazat(massiv1);

        // Способ 2: класс Random
        Random sluchay = new Random();
        double[] massiv2 = new double[razmer];
        for (int i = 0; i < razmer; i++) {
            massiv2[i] = sluchay.nextDouble() * 100;
        }
        System.out.println("\nСпособ 2: класс Random");
        System.out.print("До сортировки:    ");
        pokazat(massiv2);
        Arrays.sort(massiv2);
        System.out.print("После сортировки: ");
        pokazat(massiv2);
    }

    public static void pokazat(double[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            System.out.printf("%6.2f ", massiv[i]);
        }
        System.out.println();
    }
}