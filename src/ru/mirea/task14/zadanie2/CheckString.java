package ru.mirea.task14.zadanie2;

import java.util.regex.Pattern;

public class CheckString {

    public static void main(String[] args) {
        String regex = "abcdefghijklmnopqrstuv18340";
        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340"
        };

        for (String s : tests) {
            System.out.println(s + " -> " + Pattern.matches(regex, s));
        }
    }
}