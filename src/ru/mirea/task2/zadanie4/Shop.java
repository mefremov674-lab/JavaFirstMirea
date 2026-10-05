package ru.mirea.task2.zadanie4;

public class Shop {
    private Computer[] kompyutery;
    private int kolichestvo;

    public Shop(int razmer) {
        kompyutery = new Computer[razmer];
        kolichestvo = 0;
    }

    public void dobavit(Computer komp) {
        if (kolichestvo < kompyutery.length) {
            kompyutery[kolichestvo] = komp;
            kolichestvo++;
            System.out.println("Компьютер добавлен");
        } else {
            System.out.println("В магазине нет места");
        }
    }

    public void udalit(String nazvanie) {
        int nomer = nayti(nazvanie);
        if (nomer == -1) {
            System.out.println("Такого компьютера нет");
            return;
        }
        for (int i = nomer; i < kolichestvo - 1; i++) {
            kompyutery[i] = kompyutery[i + 1];
        }
        kompyutery[kolichestvo - 1] = null;
        kolichestvo--;
        System.out.println("Компьютер удалён");
    }

    public int nayti(String nazvanie) {
        for (int i = 0; i < kolichestvo; i++) {
            if (kompyutery[i].getNazvanie().equalsIgnoreCase(nazvanie)) {
                return i;
            }
        }
        return -1;
    }

    public Computer poluchit(int nomer) {
        return kompyutery[nomer];
    }

    public void pokazatVse() {
        if (kolichestvo == 0) {
            System.out.println("Магазин пуст");
            return;
        }
        for (int i = 0; i < kolichestvo; i++) {
            System.out.println((i + 1) + ") " + kompyutery[i]);
        }
    }
}