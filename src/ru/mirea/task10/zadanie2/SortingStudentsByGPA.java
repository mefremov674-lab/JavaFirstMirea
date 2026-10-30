package ru.mirea.task10.zadanie2;

import ru.mirea.task9.zadanie1.Student;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    private Student[] iDNumber;

    // Правило сравнения: по баллу по убыванию
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }

    // Заполнение массива
    public void setArray() {
        iDNumber = new Student[] {
                new Student(105, "Иван", "Петров", "Информатика", 1, "КВБО-01-25", 4.5),
                new Student(101, "Анна", "Сидорова", "Информатика", 1, "КВБО-01-25", 4.9),
                new Student(110, "Олег", "Иванов", "Робототехника", 1, "КВБО-02-25", 3.8),
                new Student(103, "Мария", "Кузнецова", "Робототехника", 1, "КВБО-02-25", 4.2),
                new Student(107, "Пётр", "Смирнов", "Информатика", 1, "КВБО-01-25", 4.0)
        };
    }

    // Вывод массива
    public void outArray() {
        for (Student s : iDNumber) {
            System.out.println(s);
        }
    }

    // Быстрая сортировка (вызов)
    public void quicksort(Comparator<Student> cmp) {
        quickSortRec(iDNumber, 0, iDNumber.length - 1, cmp);
    }

    private void quickSortRec(Student[] arr, int low, int high, Comparator<Student> cmp) {
        // Базовый случай: в части меньше двух элементов
        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        Student pivot = arr[(low + high) / 2];

        while (i <= j) {
            while (cmp.compare(arr[i], pivot) < 0) {
                i++;
            }
            while (cmp.compare(arr[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        // Шаг рекурсии
        quickSortRec(arr, low, j, cmp);
        quickSortRec(arr, i, high, cmp);
    }

    // Сортировка слиянием (вызов)
    public void mergeSort(Comparator<Student> cmp) {
        mergeSortRec(iDNumber, 0, iDNumber.length - 1, cmp);
    }

    private void mergeSortRec(Student[] arr, int left, int right, Comparator<Student> cmp) {
        // Базовый случай: в части один элемент, она уже отсортирована
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSortRec(arr, left, mid, cmp);        // сортируем левую половину
        mergeSortRec(arr, mid + 1, right, cmp);   // сортируем правую половину
        merge(arr, left, mid, right, cmp);        // сливаем две отсортированные половины
    }

    private void merge(Student[] arr, int left, int mid, int right, Comparator<Student> cmp) {
        Student[] temp = new Student[right - left + 1];
        int i = left;       // позиция в левой половине
        int j = mid + 1;    // позиция в правой половине
        int k = 0;          // позиция в temp

        // Берём меньший из двух первых элементов
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
        // Дописываем остаток левой половины
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        // Дописываем остаток правой половины
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        // Копируем результат обратно в массив
        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t];
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        sorter.setArray();
        System.out.println("Исходный массив:");
        sorter.outArray();

        sorter.quicksort(sorter);   // sorter сам является компаратором по баллу
        System.out.println("\nБыстрая сортировка по баллу (по убыванию):");
        sorter.outArray();

        sorter.setArray();          // заново заполняем, чтобы сортировать с нуля
        sorter.mergeSort(sorter);
        System.out.println("\nСортировка слиянием по баллу (по убыванию):");
        sorter.outArray();

        sorter.setArray();
        sorter.quicksort(new SurnameComparator());
        System.out.println("\nБыстрая сортировка по фамилии:");
        sorter.outArray();
    }
}