package ru.mirea.task2.zadanie5;

public class ПитомникСобак {
    private Dog[] sobaki;
    private int kolichestvo;

    public ПитомникСобак(int razmer) {
        sobaki = new Dog[razmer];
        kolichestvo = 0;
    }

    public void dobavit(Dog sobaka) {
        if (kolichestvo < sobaki.length) {
            sobaki[kolichestvo] = sobaka;
            kolichestvo++;
        } else {
            System.out.println("В питомнике нет места для " + sobaka.getKlichka());
        }
    }

    public void pokazatVse() {
        System.out.println("Собак в питомнике: " + kolichestvo);
        for (int i = 0; i < kolichestvo; i++) {
            System.out.println((i + 1) + ") " + sobaki[i]);
        }
    }

    public static void main(String[] args) {
        ПитомникСобак pitomnik = new ПитомникСобак(5);

        pitomnik.dobavit(new Dog("Шарик", 3));
        pitomnik.dobavit(new Dog("Бобик", 5));
        pitomnik.dobavit(new Dog("Рекс", 1));

        pitomnik.pokazatVse();

        Dog drug = new Dog("Тузик", 2);
        drug.setVozrast(4);
        drug.setKlichka("Тузик-младший");
        pitomnik.dobavit(drug);

        System.out.println();
        pitomnik.pokazatVse();
    }
}