package ru.mirea.task8.zadanie8;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String s, int left, int right) {
        // Базовый случай: индексы встретились, все пары совпали
        if (left >= right) {
            return true;
        }
        // Крайние символы разные: не палиндром
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        // Шаг рекурсии: сдвигаем оба края к центру
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = sc.nextLine();

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}