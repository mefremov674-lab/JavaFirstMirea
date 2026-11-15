package ru.mirea.task17.zadanie3;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student() {
    }

    // Считывание атрибутов с консоли
    public void read(Scanner sc) {
        System.out.print("Имя: ");
        name = sc.nextLine();
        System.out.print("Возраст: ");
        while (true) {
            try {
                age = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Нужно целое число. Повторите: ");
            }
        }
        System.out.print("Группа: ");
        group = sc.nextLine();
    }

    // Вывод атрибутов на экран
    public void print() {
        System.out.println("Имя: " + name + ", возраст: " + age + ", группа: " + group);
    }
}