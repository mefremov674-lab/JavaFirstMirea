package ru.mirea.task18.zadanie6;

public class Main {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        demo.printMessage("abc");

        try {
            demo.printMessage(null);
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("Program continues");
    }
}