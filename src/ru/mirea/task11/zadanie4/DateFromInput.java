package ru.mirea.task11.zadanie4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFromInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите: год месяц число часы минуты (через пробел)");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hours = sc.nextInt();
        int minutes = sc.nextInt();

        // Объект Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, hours, minutes, 0);   // месяц в Calendar с нуля
        cal.set(Calendar.MILLISECOND, 0);

        // Объект Date: способ 1, из Calendar
        Date date1 = cal.getTime();
        // Объект Date: способ 2, через конструктор с миллисекундами
        Date date2 = new Date(cal.getTimeInMillis());

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Date (getTime): " + sdf.format(date1));
        System.out.println("Date (new Date(long)): " + sdf.format(date2));

        System.out.printf("Calendar: %4d/%02d/%02d %02d:%02d%n",
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE));
    }
}