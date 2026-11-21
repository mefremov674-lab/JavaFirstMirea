package ru.mirea.task18.zadanie8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter key: ");
            String key = myScanner.nextLine();
            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + ". Try again.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}