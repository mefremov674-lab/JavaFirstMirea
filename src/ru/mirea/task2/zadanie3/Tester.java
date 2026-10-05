package ru.mirea.task2.zadanie3;

public class Tester {
    private Circle[] krugi;
    private int kolichestvo;

    public Tester(int razmer) {
        krugi = new Circle[razmer];
        kolichestvo = 0;
    }

    public void dobavit(Circle krug) {
        if (kolichestvo < krugi.length) {
            krugi[kolichestvo] = krug;
            kolichestvo++;
        } else {
            System.out.println("Массив заполнен, окружность не добавлена");
        }
    }

    public void pokazatVse() {
        System.out.println("Всего окружностей: " + kolichestvo);
        for (int i = 0; i < kolichestvo; i++) {
            System.out.println((i + 1) + ") " + krugi[i]);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        Point tochka = new Point(1.0, 2.0);
        tester.dobavit(new Circle(tochka, 5.0));
        tester.dobavit(new Circle(-3.0, 4.0, 2.5));
        tester.dobavit(new Circle(0.0, 0.0, 10.0));
        tester.dobavit(new Circle(7.0, 7.0, 1.0));

        tester.pokazatVse();
    }
}