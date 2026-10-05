package ru.mirea.task3.obolochki1;

public class DoubleDemo {
    public static void main(String[] args) {
        // 1. Создание объектов Double через valueOf()
        Double chislo1 = Double.valueOf(3.75);
        Double chislo2 = Double.valueOf("12.5");
        System.out.println("1. Объекты Double: " + chislo1 + " и " + chislo2);

        // 2. Строка -> double через parseDouble()
        String stroka = "45.678";
        double prostoe = Double.parseDouble(stroka);
        System.out.println("2. Из строки \"" + stroka + "\" получено число: " + prostoe);

        // 3. Объект Double -> все примитивные типы
        Double obekt = Double.valueOf(130.99);
        byte b = obekt.byteValue();
        short s = obekt.shortValue();
        int i = obekt.intValue();
        long l = obekt.longValue();
        float f = obekt.floatValue();
        double d = obekt.doubleValue();
        System.out.println("3. Преобразование " + obekt + ":");
        System.out.println("   byte   = " + b);
        System.out.println("   short  = " + s);
        System.out.println("   int    = " + i);
        System.out.println("   long   = " + l);
        System.out.println("   float  = " + f);
        System.out.println("   double = " + d);

        // 4. Вывод объекта Double на консоль
        System.out.println("4. Значение объекта: " + obekt);

        // 5. Литерал double -> строка
        String str = Double.toString(3.14);
        System.out.println("5. Строка: " + str + ", её длина: " + str.length());
    }
}