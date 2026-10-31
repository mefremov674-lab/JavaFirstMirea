package ru.mirea.task14.zadanie3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPrices {

    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 100.50 RUB, 0.004 EU, 7.20 EU.";

        Pattern p = Pattern.compile("\\d+\\.\\d{2} (USD|RUB|EU)");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}