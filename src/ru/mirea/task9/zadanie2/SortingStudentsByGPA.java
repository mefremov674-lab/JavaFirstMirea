package ru.mirea.task9.zadanie2;

import ru.mirea.task9.zadanie1.Student;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    // Правило сравнения: по баллу по убыванию (b и a поменяны местами)
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }

    // Быстрая сортировка
    public void quickSort(Student[] arr, int low, int high) {
        // Базовый случай: в части меньше двух элементов
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        Student pivot = arr[(low + high) / 2];   // опорный элемент

        while (i <= j) {
            while (compare(arr[i], pivot) < 0) {  // ищем слева тот, что должен быть правее опорного
                i++;
            }
            while (compare(arr[j], pivot) > 0) {  // ищем справа тот, что должен быть левее опорного
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];            // меняем их местами
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // Шаг рекурсии: сортируем левую и правую части
        quickSort(arr, low, j);
        quickSort(arr, i, high);
    }

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

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("\nПосле сортировки по баллу (по убыванию):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}