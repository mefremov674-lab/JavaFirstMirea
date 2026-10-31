package ru.mirea.task11.zadanie3;

public class TestBirthDate {

    public static void main(String[] args) {
        StudentWithBirthDate s = new StudentWithBirthDate(
                101, "Анна", "Сидорова", "Информатика", 1, "КВБО-01-25", 4.9,
                2008, 5, 15);

        System.out.println(s);
        System.out.println("Короткий формат: " + s.getBirthDateString("short"));
        System.out.println("Средний формат: " + s.getBirthDateString("medium"));
        System.out.println("Полный формат: " + s.getBirthDateString("full"));
    }
}