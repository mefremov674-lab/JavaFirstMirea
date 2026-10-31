package ru.mirea.task13.zadanie1;

public class StringMethods {

    public static void processString(String s) {
        // 2. Последний символ
        System.out.println("Последний символ: " + s.charAt(s.length() - 1));

        // 3. Заканчивается ли на !!!
        System.out.println("Заканчивается на !!!: " + s.endsWith("!!!"));

        // 4. Начинается ли с I like
        System.out.println("Начинается с I like: " + s.startsWith("I like"));

        // 5. Содержит ли Java
        System.out.println("Содержит Java: " + s.contains("Java"));

        // 6. Позиция подстроки Java
        int pos = s.indexOf("Java");
        System.out.println("Позиция Java: " + pos);

        // 7. Замена всех символов a на o
        System.out.println("Замена a на o: " + s.replace('a', 'o'));

        // 8. Верхний регистр
        System.out.println("Верхний регистр: " + s.toUpperCase());

        // 9. Нижний регистр
        System.out.println("Нижний регистр: " + s.toLowerCase());

        // 10. Вырезаем Java с помощью substring
        String cut = s.substring(pos, pos + 4);                  // сама подстрока Java
        String without = s.substring(0, pos) + s.substring(pos + 4);   // строка без неё
        System.out.println("Вырезанная подстрока: " + cut);
        System.out.println("Строка без Java: " + without);
    }

    public static void main(String[] args) {
        processString("I like Java!!!");
    }
}