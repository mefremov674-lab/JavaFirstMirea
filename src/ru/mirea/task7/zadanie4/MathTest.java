package ru.mirea.task7.zadanie4;

public class MathTest {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        // MathCalculable mc2 = new MathCalculable(); — ошибка: нельзя создать объект интерфейса

        System.out.println("2 в степени 10 = " + mc.stepen(2, 10));
        System.out.println("2 в степени -2 = " + mc.stepen(2, -2));
        System.out.println("5 в степени 0 = " + mc.stepen(5, 0));

        System.out.println("Модуль 3 + 4i = " + mc.modulKompleksnogo(3, 4));

        System.out.printf("Длина окружности радиуса 5 = %.4f%n", mc.dlinaOkruzhnosti(5));
        System.out.println("Число PI из интерфейса: " + MathCalculable.PI);
    }
}