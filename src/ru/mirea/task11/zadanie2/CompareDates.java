package ru.mirea.task11.zadanie2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CompareDates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = sc.nextInt();
        System.out.print("Введите день: ");
        int day = sc.nextInt();

        // Введённая дата (время 00:00:00)
        Calendar userCal = Calendar.getInstance();
        userCal.set(year, month - 1, day, 0, 0, 0);   // месяц в Calendar с нуля, поэтому month - 1
        userCal.set(Calendar.MILLISECOND, 0);
        Date userDate = userCal.getTime();

        // Текущий момент (для вывода) и текущая дата без времени (для сравнения)
        Calendar nowCal = Calendar.getInstance();
        Date nowFull = nowCal.getTime();
        nowCal.set(Calendar.HOUR_OF_DAY, 0);
        nowCal.set(Calendar.MINUTE, 0);
        nowCal.set(Calendar.SECOND, 0);
        nowCal.set(Calendar.MILLISECOND, 0);
        Date today = nowCal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sdfFull = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Текущее системное время: " + sdfFull.format(nowFull));
        System.out.println("Введённая дата: " + sdf.format(userDate));

        int result = userDate.compareTo(today);
        if (result < 0) {
            System.out.println("Введённая дата раньше текущей");
        } else if (result > 0) {
            System.out.println("Введённая дата позже текущей");
        } else {
            System.out.println("Введённая дата совпадает с текущей");
        }
    }
}