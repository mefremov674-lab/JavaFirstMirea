package ru.mirea.task10.zadanie3;

import ru.mirea.task9.zadanie1.Student;
import ru.mirea.task10.zadanie2.SortingStudentsByGPA;
import java.util.Comparator;

public class MergeStudentLists {

    // Сортировка слиянием (та же, что в задании 2)
    private static void mergeSortRec(Student[] arr, int left, int right, Comparator<Student> cmp) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSortRec(arr, left, mid, cmp);
        mergeSortRec(arr, mid + 1, right, cmp);
        merge(arr, left, mid, right, cmp);
    }

    // Слияние двух отсортированных частей: [left..mid] и [mid+1..right]
    private static void merge(Student[] arr, int left, int mid, int right, Comparator<Student> cmp) {
        Student[] temp = new Student[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (cmp.compare(arr[i], arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t];
        }
    }

    // Объединение двух списков в один отсортированный
    public static Student[] mergeLists(Student[] a, Student[] b, Comparator<Student> cmp) {
        // 1. Сортируем каждый список
        mergeSortRec(a, 0, a.length - 1, cmp);
        mergeSortRec(b, 0, b.length - 1, cmp);

        // 2. Кладём оба в один массив: сначала a, потом b
        Student[] all = new Student[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            all[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            all[a.length + i] = b[i];
        }

        // 3. Один раз сливаем две отсортированные половины
        merge(all, 0, a.length - 1, all.length - 1, cmp);
        return all;
    }

    public static void print(String title, Student[] arr) {
        System.out.println(title);
        for (Student s : arr) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] groupA = {
                new Student(105, "Иван", "Петров", "Информатика", 1, "КВБО-01-25", 4.5),
                new Student(101, "Анна", "Сидорова", "Информатика", 1, "КВБО-01-25", 4.9),
                new Student(110, "Олег", "Иванов", "Информатика", 1, "КВБО-01-25", 3.8)
        };
        Student[] groupB = {
                new Student(103, "Мария", "Кузнецова", "Робототехника", 1, "КВБО-02-25", 4.2),
                new Student(107, "Пётр", "Смирнов", "Робототехника", 1, "КВБО-02-25", 4.0),
                new Student(102, "Елена", "Орлова", "Робототехника", 1, "КВБО-02-25", 4.7)
        };

        print("Список 1:", groupA);
        print("Список 2:", groupB);

        Student[] result = mergeLists(groupA, groupB, new SortingStudentsByGPA());
        print("Объединённый список по баллу (по убыванию):", result);
    }
}