package ru.mirea.task13.zadanie3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // Запись семи частей в поля
    private void fill(String[] p) {
        country = p[0];
        region = p[1];
        city = p[2];
        street = p[3];
        house = p[4];
        building = p[5];
        apartment = p[6];
    }

    // а) разделитель только запятая, метод split()
    public void parseWithSplit(String s) {
        String[] raw = s.split(",");
        String[] p = new String[7];
        for (int i = 0; i < 7; i++) {
            if (i < raw.length) {
                p[i] = raw[i].trim();
            } else {
                p[i] = "";
            }
        }
        fill(p);
    }

    // б) разделитель любой из , . ; класс StringTokenizer
    public void parseWithTokenizer(String s) {
        String delimiters = ",.;";
        StringTokenizer st = new StringTokenizer(s, delimiters, true);
        String[] p = {"", "", "", "", "", "", ""};
        int idx = 0;
        while (st.hasMoreTokens() && idx < 7) {
            String token = st.nextToken();
            if (delimiters.contains(token)) {
                idx++;                    // разделитель: переходим к следующему полю
            } else {
                p[idx] = token.trim();    // часть адреса: записываем в текущее поле
            }
        }
        fill(p);
    }

    @Override
    public String toString() {
        return "Страна: " + country + ", регион: " + region + ", город: " + city
                + ", улица: " + street + ", дом: " + house
                + ", корпус: " + building + ", квартира: " + apartment;
    }
}