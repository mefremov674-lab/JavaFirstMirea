package ru.mirea.task10.zadanie2;

import ru.mirea.task9.zadanie1.Student;
import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {

    // Сортировка по фамилии в алфавитном порядке
    @Override
    public int compare(Student a, Student b) {
        return a.getSurname().compareTo(b.getSurname());
    }
}