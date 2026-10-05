package ru.mirea.task6.zadanie11;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double gradusy = Double.parseDouble(sc.nextLine().replace(',', '.'));

        Convertable[] perevodchiki = {new Kelvin(), new Fahrenheit()};

        for (Convertable p : perevodchiki) {
            System.out.printf("%.2f °C = %.2f (%s)%n",
                    gradusy, p.convert(gradusy), p.nazvanie());
        }
    }
}