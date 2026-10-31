package ru.mirea.task11.zadanie5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmark {

    static final int N = 50000;        // количество элементов
    static final int SEARCHES = 1000;  // количество поисков

    // Добавление в конец
    static long testAdd(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        return (System.nanoTime() - start) / 1000;   // в микросекундах
    }

    // Поиск элемента, которого в списке нет (проход по всему списку)
    static long testSearch(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < SEARCHES; i++) {
            list.indexOf(-1);
        }
        return (System.nanoTime() - start) / 1000;
    }

    // Удаление из начала, пока список не опустеет
    static long testRemoveFirst(List<Integer> list) {
        long start = System.nanoTime();
        while (!list.isEmpty()) {
            list.remove(0);   // 0 это индекс, удаляется первый элемент
        }
        return (System.nanoTime() - start) / 1000;
    }

    // Вставка в начало
    static long testInsertFirst(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(0, i);
        }
        return (System.nanoTime() - start) / 1000;
    }

    static void runTests(String name, List<Integer> list) {
        long tAdd = testAdd(list);
        long tSearch = testSearch(list);
        long tRemove = testRemoveFirst(list);   // после этого список пуст
        long tInsert = testInsertFirst(list);
        System.out.printf("%-12s %12d %12d %12d %12d%n", name, tAdd, tSearch, tRemove, tInsert);
    }

    public static void main(String[] args) {
        System.out.println("Время в микросекундах, N = " + N);
        System.out.printf("%-12s %12s %12s %12s %12s%n",
                "Список", "Добавление", "Поиск", "Удаление", "Вставка");
        runTests("ArrayList", new ArrayList<Integer>());
        runTests("LinkedList", new LinkedList<Integer>());
    }
}