package ru.mirea.task3.zadanie3;

import java.util.Random;

public class Vozrastanie {
    public static void main(String[] args) {
        Random sluchay = new Random();
        int[] massiv = new int[4];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = 10 + sluchay.nextInt(90);
        }

        System.out.print("Массив: ");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

        boolean vozrastaet = true;
        for (int i = 1; i < massiv.length; i++) {
            if (massiv[i] <= massiv[i - 1]) {
                vozrastaet = false;
                break;
            }
        }

        if (vozrastaet) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью");
        }
    }
}