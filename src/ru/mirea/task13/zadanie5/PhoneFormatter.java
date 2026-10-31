package ru.mirea.task13.zadanie5;

public class PhoneFormatter {

    public static String format(String phone) {
        String code;
        String number;

        if (phone.startsWith("+") && phone.length() >= 12) {
            int len = phone.length();
            code = phone.substring(1, len - 10);
            number = phone.substring(len - 10);
        } else if (phone.startsWith("8") && phone.length() == 11) {
            code = "7";
            number = phone.substring(1);
        } else {
            return "Неверный формат номера";
        }

        return "+" + code + number.substring(0, 3) + "-"
                + number.substring(3, 6) + "-" + number.substring(6);
    }

    public static void main(String[] args) {
        System.out.println(format("+79175655655"));
        System.out.println(format("+104289652211"));
        System.out.println(format("89175655655"));
        System.out.println(format("12345"));
    }
}