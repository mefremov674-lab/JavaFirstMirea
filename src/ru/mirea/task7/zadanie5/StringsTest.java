package ru.mirea.task7.zadanie5;

public class StringsTest {
    public static void main(String[] args) {
        Stroki obrabotka = new ProcessStrings();
        String stroka = "программирование";

        System.out.println("Исходная строка: " + stroka);
        System.out.println("Количество символов: " + obrabotka.kolichestvoSimvolov(stroka));
        System.out.println("Количество букв 'р': " + obrabotka.kolichestvoSimvolov(stroka, 'р'));
        System.out.println("Символы на нечётных позициях: " + obrabotka.nechetnyePozicii(stroka));
        System.out.println("Перевёрнутая строка: " + obrabotka.perevernut(stroka));
    }
}