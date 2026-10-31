package ru.mirea.task14.zadanie7;

import java.util.regex.Pattern;

public class CheckPassword {

    public static boolean isStrong(String p) {
        boolean format = Pattern.matches("[A-Za-z0-9_]{8,}", p);
        boolean hasUpper = Pattern.compile("[A-Z]").matcher(p).find();
        boolean hasLower = Pattern.compile("[a-z]").matcher(p).find();
        boolean hasDigit = Pattern.compile("[0-9]").matcher(p).find();
        return format && hasUpper && hasLower && hasDigit;
    }

    public static void main(String[] args) {
        String[] passwords = {"F032_Password", "TrySpy1", "smart_pass", "A007", "Abcdefg1"};

        for (String p : passwords) {
            if (isStrong(p)) {
                System.out.println(p + " -> надёжный");
            } else {
                System.out.println(p + " -> ненадёжный");
            }
        }
    }
}