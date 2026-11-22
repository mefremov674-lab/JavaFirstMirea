package ru.mirea.task20.zadanie1;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat " + getName();
    }
}