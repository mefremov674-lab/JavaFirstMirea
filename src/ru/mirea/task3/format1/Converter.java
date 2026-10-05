package ru.mirea.task3.format1;

public class Converter {
    // Курс: сколько рублей стоит 1 единица валюты
    private String[] kody = {"RUB", "USD", "EUR", "CNY"};
    private String[] nazvaniya = {"Рубль", "Доллар США", "Евро", "Юань"};
    private double[] kursy = {1.0, 82.0, 95.0, 11.4};

    public double perevesti(double summa, int iz, int v) {
        double vRublyah = summa * kursy[iz];
        return vRublyah / kursy[v];
    }

    public String getKod(int nomer) {
        return kody[nomer];
    }

    public int kolichestvoValyut() {
        return kody.length;
    }

    public void pokazatKursy() {
        System.out.println("Курсы валют к рублю:");
        for (int i = 0; i < kody.length; i++) {
            System.out.printf("%d) %-12s %-4s %8.2f руб.%n",
                    i + 1, nazvaniya[i], kody[i], kursy[i]);
        }
    }
}