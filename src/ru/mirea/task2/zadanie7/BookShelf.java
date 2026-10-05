package ru.mirea.task2.zadanie7;

public class BookShelf {
    private Book[] knigi;
    private int kolichestvo;

    public BookShelf(int razmer) {
        knigi = new Book[razmer];
        kolichestvo = 0;
    }

    public void dobavit(String avtor, String nazvanie, int god) {
        if (kolichestvo < knigi.length) {
            knigi[kolichestvo] = new Book(avtor, nazvanie, god);
            kolichestvo++;
        } else {
            System.out.println("На полке нет места");
        }
    }

    public Book samayaNovaya() {
        if (kolichestvo == 0) return null;
        Book luchshaya = knigi[0];
        for (int i = 1; i < kolichestvo; i++) {
            if (knigi[i].getGod() > luchshaya.getGod()) {
                luchshaya = knigi[i];
            }
        }
        return luchshaya;
    }

    public Book samayaStaraya() {
        if (kolichestvo == 0) return null;
        Book luchshaya = knigi[0];
        for (int i = 1; i < kolichestvo; i++) {
            if (knigi[i].getGod() < luchshaya.getGod()) {
                luchshaya = knigi[i];
            }
        }
        return luchshaya;
    }

    public void sortirovat() {
        for (int i = 0; i < kolichestvo - 1; i++) {
            for (int j = 0; j < kolichestvo - 1 - i; j++) {
                if (knigi[j].getGod() > knigi[j + 1].getGod()) {
                    Book vremennaya = knigi[j];
                    knigi[j] = knigi[j + 1];
                    knigi[j + 1] = vremennaya;
                }
            }
        }
    }

    public void pokazatVse() {
        for (int i = 0; i < kolichestvo; i++) {
            System.out.println((i + 1) + ") " + knigi[i]);
        }
    }
}