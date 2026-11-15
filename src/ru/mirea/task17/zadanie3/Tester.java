package ru.mirea.task17.zadanie3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();

        while (true) {
            System.out.println("\n1 - Добавить студента");
            System.out.println("2 - Удалить студента по номеру");
            System.out.println("3 - Показать студента по номеру");
            System.out.println("4 - Показать всех (один круг)");
            System.out.println("5 - Обойти по кругу несколько шагов");
            System.out.println("6 - Очистить список");
            System.out.println("7 - Проверить, пуст ли список");
            System.out.println("0 - Выход");
            System.out.print("Выбор: ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    Student s = new Student();
                    s.read(sc);
                    list.add(s);
                    break;
                case "2":
                    if (!list.remove(readNumber(sc, "Номер: "))) {
                        System.out.println("Нет элемента с таким номером");
                    }
                    break;
                case "3":
                    if (!list.printAt(readNumber(sc, "Номер: "))) {
                        System.out.println("Нет элемента с таким номером");
                    }
                    break;
                case "4":
                    list.printAll();
                    break;
                case "5":
                    list.printCircle(readNumber(sc, "Сколько шагов: "));
                    break;
                case "6":
                    list.clear();
                    System.out.println("Список очищен");
                    break;
                case "7":
                    System.out.println(list.isEmpty() ? "Список пуст" : "В списке элементов: " + list.size());
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Нет такого пункта");
            }
        }
    }

    private static int readNumber(Scanner sc, String text) {
        System.out.print(text);
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}