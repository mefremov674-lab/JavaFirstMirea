package ru.mirea.task9.zadanie1;

public class TestStudents {

    public static void main(String[] args) {
        Student[] students = {
                new Student(105, "Иван", "Петров", "Информатика", 1, "КВБО-01-25", 4.5),
                new Student(101, "Анна", "Сидорова", "Информатика", 1, "КВБО-01-25", 4.9),
                new Student(110, "Олег", "Иванов", "Робототехника", 1, "КВБО-02-25", 3.8),
                new Student(103, "Мария", "Кузнецова", "Робототехника", 1, "КВБО-02-25", 4.2),
                new Student(107, "Пётр", "Смирнов", "Информатика", 1, "КВБО-01-25", 4.0)
        };

        System.out.println("До сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }

        Sorting.insertionSort(students);

        System.out.println("\nПосле сортировки по iDNumber:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}