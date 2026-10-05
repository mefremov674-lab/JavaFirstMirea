package ru.mirea.task3.format1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConverterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter konverter = new Converter();

        konverter.pokazatKursy();

        System.out.print("\nВведите сумму: ");
        double summa = Double.parseDouble(sc.nextLine().replace(',', '.'));

        System.out.print("Из какой валюты (номер): ");
        int iz = Integer.parseInt(sc.nextLine()) - 1;

        System.out.print("В какую валюту (номер): ");
        int v = Integer.parseInt(sc.nextLine()) - 1;

        if (iz < 0 || iz >= konverter.kolichestvoValyut()
                || v < 0 || v >= konverter.kolichestvoValyut()) {
            System.out.println("Нет такой валюты");
            return;
        }

        double rezultat = konverter.perevesti(summa, iz, v);

        // Способ 1: printf
        System.out.printf("%n%,.2f %s = %,.2f %s%n",
                summa, konverter.getKod(iz), rezultat, konverter.getKod(v));

        // Способ 2: NumberFormat с локалью страны
        Locale[] strany = {Locale.of("ru", "RU"), Locale.US, Locale.GERMANY, Locale.CHINA};
        NumberFormat formatIz = NumberFormat.getCurrencyInstance(strany[iz]);
        NumberFormat formatV = NumberFormat.getCurrencyInstance(strany[v]);
        System.out.println(formatIz.format(summa) + " = " + formatV.format(rezultat));
    }
}