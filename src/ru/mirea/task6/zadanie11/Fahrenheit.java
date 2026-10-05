package ru.mirea.task6.zadanie11;

public class Fahrenheit implements Convertable {
    @Override
    public double convert(double gradusy) {
        return gradusy * 9 / 5 + 32;
    }

    @Override
    public String nazvanie() {
        return "Фаренгейты";
    }
}