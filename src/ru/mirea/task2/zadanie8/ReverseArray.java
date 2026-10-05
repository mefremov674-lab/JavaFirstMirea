package ru.mirea.task2.zadanie8;

public class ReverseArray {
    public static void main(String[] args) {
        String[] slova = {"один", "два", "три", "четыре", "пять"};

        System.out.print("До:    ");
        pokazat(slova);

        int levyy = 0;
        int pravyy = slova.length - 1;
        while (levyy < pravyy) {
            String vremennaya = slova[levyy];
            slova[levyy] = slova[pravyy];
            slova[pravyy] = vremennaya;
            levyy++;
            pravyy--;
        }

        System.out.print("После: ");
        pokazat(slova);
    }

    public static void pokazat(String[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();
    }
}