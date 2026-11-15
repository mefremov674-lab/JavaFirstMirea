package ru.mirea.task9.zadanie3;

public class Student implements Comparable<Student> {
    private String surname;
    private String name;
    private String group;
    private double gpa; // итоговый балл

    public Student(String surname, String name, String group, double gpa) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.gpa = gpa;
    }

    // По убыванию балла: у кого балл выше, тот "меньше" и стоит раньше
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString() {
        return surname + " " + name + ", группа " + group + ", балл " + gpa;
    }
}