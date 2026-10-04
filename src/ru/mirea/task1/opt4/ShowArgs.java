package ru.mirea.task1.opt4;

public class ShowArgs {
    public static void main(String[] args) {
        System.out.println("Количество аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}