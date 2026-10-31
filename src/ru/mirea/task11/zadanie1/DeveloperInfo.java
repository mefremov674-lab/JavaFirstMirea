package ru.mirea.task11.zadanie1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DeveloperInfo {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        // Дата получения задания: задаём вручную через Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(2026, Calendar.OCTOBER, 30, 10, 0, 0);   // год, месяц, день, часы, минуты, секунды
        Date receivedDate = cal.getTime();

        // Дата сдачи: текущий момент
        Date submitDate = new Date();

        System.out.println("Разработчик: Ефремов");
        System.out.println("Задание получено: " + sdf.format(receivedDate));
        System.out.println("Задание сдано: " + sdf.format(submitDate));
    }
}