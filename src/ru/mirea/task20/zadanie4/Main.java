package ru.mirea.task20.zadanie4;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {5, 2, 9, 1, 7};
        String[] strings = {"pear", "apple", "orange"};
        Double[] doubles = {2.5, 0.3, 8.1};

        MinMax<Integer> mmInt = new MinMax<>(ints);
        System.out.println("Integer min: " + mmInt.min() + ", max: " + mmInt.max());

        MinMax<String> mmStr = new MinMax<>(strings);
        System.out.println("String min: " + mmStr.min() + ", max: " + mmStr.max());

        MinMax<Double> mmDouble = new MinMax<>(doubles);
        System.out.println("Double min: " + mmDouble.min() + ", max: " + mmDouble.max());

        System.out.println("sum: " + Calculator.sum(5, 2.5));
        System.out.println("multiply: " + Calculator.multiply(3, 4.5));
        System.out.println("divide: " + Calculator.divide(10, 4));
        System.out.println("subtraction: " + Calculator.subtraction(10L, 3.5f));
    }
}