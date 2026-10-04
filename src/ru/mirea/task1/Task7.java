package ru.mirea.task1;

public class Task7 {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tests = {0, 1, 5, 10, 20};
        for (int i = 0; i < tests.length; i++) {
            System.out.println(tests[i] + "! = " + factorial(tests[i]));
        }
    }
}