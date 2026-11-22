package ru.mirea.task20.zadanie1;

import java.io.Serializable;

public class Trio<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private final T first;
    private final V second;
    private final K third;

    public Trio(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void printClassNames() {
        System.out.println("T: " + first.getClass().getName());
        System.out.println("V: " + second.getClass().getName());
        System.out.println("K: " + third.getClass().getName());
    }
}