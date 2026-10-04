package ru.mirea.task1.opt3;

public class ArraySum  {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 18, 9, 4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double s = (double) sum / arr.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + s);
    }

}
