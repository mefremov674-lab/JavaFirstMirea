package ru.mirea.task6.zadanie11;

public class Kelvin implements Convertable {
    @Override
    public double convert(double gradusy) {
        return gradusy + 273.15;
    }

    @Override
    public String nazvanie() {
        return "Кельвины";
    }
}