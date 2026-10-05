package ru.mirea.task2.zadanie9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] masti = {"пики", "черви", "бубны", "крести"};
        String[] znacheniya = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "валет", "дама", "король", "туз"};

        // 1. Собираем колоду из 52 карт
        String[] koloda = new String[52];
        int k = 0;
        for (int i = 0; i < masti.length; i++) {
            for (int j = 0; j < znacheniya.length; j++) {
                koloda[k] = znacheniya[j] + " " + masti[i];
                k++;
            }
        }

        // 2. Перемешиваем колоду
        for (int i = koloda.length - 1; i > 0; i--) {
            int sluchaynyy = (int) (Math.random() * (i + 1));
            String vremennaya = koloda[i];
            koloda[i] = koloda[sluchaynyy];
            koloda[sluchaynyy] = vremennaya;
        }

        // 3. Спрашиваем количество игроков
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите количество игроков (от 1 до 10): ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);

        // 4. Раздаём по 5 карт каждому
        int nomerKarty = 0;
        for (int igrok = 1; igrok <= n; igrok++) {
            System.out.println("Игрок " + igrok + ":");
            for (int karta = 0; karta < 5; karta++) {
                System.out.println(koloda[nomerKarty]);
                nomerKarty++;
            }
            System.out.println();
        }
    }
}