package ru.mirea.task20.zadanie4;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        this.array = array;
    }

    public T min() {
        T result = array[0];
        for (T item : array) {
            if (item.compareTo(result) < 0) {
                result = item;
            }
        }
        return result;
    }

    public T max() {
        T result = array[0];
        for (T item : array) {
            if (item.compareTo(result) > 0) {
                result = item;
            }
        }
        return result;
    }
}