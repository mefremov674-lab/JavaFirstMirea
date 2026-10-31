package ru.mirea.task13.zadanie6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordChain {

    // Возвращает цепочку слов или пустой StringBuilder, если составить нельзя
    public static StringBuilder getLine(String[] words) {
        StringBuilder result = new StringBuilder();
        boolean[] used = new boolean[words.length];

        // Пробуем каждое слово в качестве первого
        for (int i = 0; i < words.length; i++) {
            used[i] = true;
            result.append(words[i]);
            if (place(words, used, result, 1)) {
                return result;
            }
            used[i] = false;        // не получилось: откат
            result.setLength(0);
        }
        return result;              // здесь пустой
    }

    // count: сколько слов уже в цепочке
    private static boolean place(String[] words, boolean[] used, StringBuilder sb, int count) {
        // Базовый случай: все слова использованы
        if (count == words.length) {
            return true;
        }
        String last = sb.substring(sb.length() - 1).toLowerCase();   // последняя буква цепочки

        for (int i = 0; i < words.length; i++) {
            String first = words[i].substring(0, 1).toLowerCase();    // первая буква слова
            if (!used[i] && first.equals(last)) {
                int oldLength = sb.length();
                used[i] = true;
                sb.append(" ").append(words[i]);
                // Шаг рекурсии
                if (place(words, used, sb, count + 1)) {
                    return true;
                }
                used[i] = false;            // тупик: откат
                sb.setLength(oldLength);
            }
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = console.nextLine();

        // Читаем все слова файла в одну строку
        Scanner fileScanner = new Scanner(new File(fileName));
        StringBuilder text = new StringBuilder();
        while (fileScanner.hasNext()) {
            text.append(fileScanner.next()).append(" ");
        }
        fileScanner.close();

        if (text.length() == 0) {
            System.out.println("Файл пуст");
            return;
        }
        String[] words = text.toString().trim().split(" ");

        StringBuilder result = getLine(words);
        if (result.length() == 0) {
            System.out.println("Составить цепочку нельзя");
        } else {
            System.out.println(result);
        }
    }
}