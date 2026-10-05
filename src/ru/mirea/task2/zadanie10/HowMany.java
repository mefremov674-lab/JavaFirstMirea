package ru.mirea.task2.zadanie10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String stroka = sc.nextLine();

        stroka = stroka.trim();

        int kolichestvo;
        if (stroka.isEmpty()) {
            kolichestvo = 0;
        } else {
            String[] slova = stroka.split("\\s+");
            kolichestvo = slova.length;
        }

        System.out.println("Количество слов: " + kolichestvo);
    }
}