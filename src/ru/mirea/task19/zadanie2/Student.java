package ru.mirea.task19.zadanie2;

public class Student {
    private final String fio;
    private final double averageGrade;

    public Student(String fio, double averageGrade) {
        if (fio == null || fio.trim().isEmpty()) {
            throw new EmptyStringException("Student FIO is empty");
        }
        this.fio = fio;
        this.averageGrade = averageGrade;
    }

    public String getFio() {
        return fio;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return fio + " - " + averageGrade;
    }
}