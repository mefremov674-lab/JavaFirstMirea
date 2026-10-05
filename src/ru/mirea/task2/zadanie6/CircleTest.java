package ru.mirea.task2.zadanie6;

public class CircleTest {
    public static void main(String[] args) {
        Circle krug1 = new Circle(0, 0, 5);
        Circle krug2 = new Circle(2, 3, 3);

        System.out.println(krug1);
        System.out.printf("Площадь: %.2f, длина: %.2f%n", krug1.ploshad(), krug1.dlina());

        System.out.println(krug2);
        System.out.printf("Площадь: %.2f, длина: %.2f%n", krug2.ploshad(), krug2.dlina());

        pokazatSravnenie(krug1, krug2);

        krug2.setRadius(5);
        System.out.println("\nПосле изменения радиуса второй окружности:");
        System.out.println(krug2);
        pokazatSravnenie(krug1, krug2);
    }

    public static void pokazatSravnenie(Circle a, Circle b) {
        int rezultat = a.sravnit(b);
        if (rezultat > 0) {
            System.out.println("Первая окружность больше второй");
        } else if (rezultat < 0) {
            System.out.println("Первая окружность меньше второй");
        } else {
            System.out.println("Окружности равны по размеру");
        }
    }
}