package ru.mirea.task2.zadanie4;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop magazin = new Shop(10);

        int vybor;
        do {
            System.out.println("\n1 - добавить компьютер");
            System.out.println("2 - удалить компьютер");
            System.out.println("3 - найти компьютер");
            System.out.println("4 - показать все");
            System.out.println("0 - выход");
            System.out.print("Ваш выбор: ");
            vybor = Integer.parseInt(sc.nextLine());

            if (vybor == 1) {
                System.out.print("Название: ");
                String nazvanie = sc.nextLine();
                System.out.print("Цена: ");
                int cena = Integer.parseInt(sc.nextLine());
                System.out.print("Память (ГБ): ");
                int pamyat = Integer.parseInt(sc.nextLine());
                magazin.dobavit(new Computer(nazvanie, cena, pamyat));
            } else if (vybor == 2) {
                System.out.print("Название для удаления: ");
                magazin.udalit(sc.nextLine());
            } else if (vybor == 3) {
                System.out.print("Название для поиска: ");
                int nomer = magazin.nayti(sc.nextLine());
                if (nomer == -1) {
                    System.out.println("Не найден");
                } else {
                    System.out.println("Найден: " + magazin.poluchit(nomer));
                }
            } else if (vybor == 4) {
                magazin.pokazatVse();
            }
        } while (vybor != 0);

        System.out.println("Работа завершена");
    }
}