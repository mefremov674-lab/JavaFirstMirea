package ru.mirea.task7.zadanie4;

public class MathFunc implements MathCalculable {

    @Override
    public double stepen(double chislo, int pokazatel) {
        double rezultat = 1;
        for (int i = 0; i < Math.abs(pokazatel); i++) {
            rezultat *= chislo;
        }
        if (pokazatel < 0) {
            rezultat = 1 / rezultat;
        }
        return rezultat;
    }

    @Override
    public double modulKompleksnogo(double deystvitelnaya, double mnimaya) {
        return Math.sqrt(deystvitelnaya * deystvitelnaya + mnimaya * mnimaya);
    }

    @Override
    public double dlinaOkruzhnosti(double radius) {
        return 2 * PI * radius;
    }
}