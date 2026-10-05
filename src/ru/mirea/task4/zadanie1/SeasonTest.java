package ru.mirea.task4.zadanie1;

public class SeasonTest {
    public static void main(String[] args) {
        // 1. Любимое время года и вся информация о нём
        Season lyubimoe = Season.LETO;
        System.out.println("Моё любимое время года: " + lyubimoe);
        System.out.println("Номер в перечислении: " + lyubimoe.ordinal());
        System.out.println("Средняя температура: " + lyubimoe.getTemperatura() + " °C");
        System.out.println("Описание: " + lyubimoe.getDescription());

        // 2. Метод со switch
        System.out.println();
        lyublyu(lyubimoe);
        lyublyu(Season.ZIMA);

        // 6. Все времена года в цикле
        System.out.println("\nВсе времена года:");
        for (Season vremya : Season.values()) {
            System.out.printf("%-6s %4d °C   %s%n",
                    vremya, vremya.getTemperatura(), vremya.getDescription());
        }
    }

    public static void lyublyu(Season vremya) {
        switch (vremya) {
            case ZIMA:
                System.out.println("Я люблю зиму");
                break;
            case VESNA:
                System.out.println("Я люблю весну");
                break;
            case LETO:
                System.out.println("Я люблю лето");
                break;
            case OSEN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}