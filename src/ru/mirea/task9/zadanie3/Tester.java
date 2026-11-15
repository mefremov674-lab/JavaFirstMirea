package ru.mirea.task9.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    // Слияние двух уже отсортированных списков в один отсортированный
    public static List<Student> merge(List<Student> a, List<Student> b) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i).compareTo(b.get(j)) <= 0) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }
        while (i < a.size()) {
            result.add(a.get(i));
            i++;
        }
        while (j < b.size()) {
            result.add(b.get(j));
            j++;
        }
        return result;
    }

    // Сортировка слиянием
    public static List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }
        int mid = list.size() / 2;
        List<Student> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        List<Student> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));
        return merge(left, right);
    }

    private static void printList(String title, List<Student> list) {
        System.out.println(title);
        for (Student s : list) {
            System.out.println("  " + s);
        }
    }

    public static void main(String[] args) {
        List<Student> first = new ArrayList<>();
        first.add(new Student("Иванов", "Иван", "КВБО-12-25", 4.2));
        first.add(new Student("Петров", "Пётр", "КВБО-12-25", 3.8));
        first.add(new Student("Сидорова", "Анна", "КВБО-12-25", 4.9));
        first.add(new Student("Кузнецов", "Олег", "КВБО-12-25", 3.1));

        List<Student> second = new ArrayList<>();
        second.add(new Student("Смирнова", "Мария", "КВБО-13-25", 4.5));
        second.add(new Student("Попов", "Егор", "КВБО-13-25", 2.9));
        second.add(new Student("Волков", "Артём", "КВБО-13-25", 4.9));

        printList("Первый список:", first);
        printList("Второй список:", second);

        // 1) сортируем каждый список, 2) сливаем в один
        List<Student> sortedFirst = mergeSort(first);
        List<Student> sortedSecond = mergeSort(second);
        List<Student> result = merge(sortedFirst, sortedSecond);

        printList("Объединённый список (по убыванию балла):", result);
    }
}