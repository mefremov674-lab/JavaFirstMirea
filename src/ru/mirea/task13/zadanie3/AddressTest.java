package ru.mirea.task13.zadanie3;

public class AddressTest {

    public static void main(String[] args) {
        String[] commaAddresses = {
                "Россия, Московская область, Москва, Ленина, 5, 2, 17",
                "Россия,Татарстан,Казань,  Баумана ,10,,3",
                "Беларусь, Минская область, Минск, Независимости, 4, 1, 25",
                "Россия,Свердловская область,Екатеринбург,Мира,12,3,"
        };
        String[] mixedAddresses = {
                "Россия;Московская область;Москва;Ленина;5;2;17",
                "Россия, Татарстан. Казань; Баумана, 10; ; 3",
                "Беларусь.Минская область.Минск.Независимости.4.1.25",
                "Россия,Свердловская область,Екатеринбург,Мира,12,3,"
        };

        Address a = new Address();

        System.out.println("а) split, разделитель запятая:");
        for (String s : commaAddresses) {
            a.parseWithSplit(s);
            System.out.println(a);
        }

        System.out.println("\nб) StringTokenizer, разделители , . ;");
        for (String s : mixedAddresses) {
            a.parseWithTokenizer(s);
            System.out.println(a);
        }
    }
}