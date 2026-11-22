package ru.mirea.task20.zadanie1;

public class Main {
    public static void main(String[] args) {
        Trio<Integer, Cat, String> trio = new Trio<>(42, new Cat("Murka"), "text");

        System.out.println(trio.getFirst());
        System.out.println(trio.getSecond());
        System.out.println(trio.getThird());
        trio.printClassNames();

        Trio<String, Cat, Double> trio2 = new Trio<>("abc", new Cat("Barsik"), 3.14);
        trio2.printClassNames();
    }
}