package ru.mirea.task9.zadanie1;

public class Sorting {

    // Сортировка вставками для любых объектов, которые умеют сравнивать себя
    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i];     // элемент, который вставляем
            int j = i - 1;
            // сдвигаем вправо все элементы, которые больше key
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;            // ставим key на своё место
        }
    }
}