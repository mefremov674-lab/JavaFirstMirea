package ru.mirea.task2.zadanie4;

public class Computer {
    private String nazvanie;
    private int cena;
    private int pamyat;

    public Computer(String nazvanie, int cena, int pamyat) {
        this.nazvanie = nazvanie;
        this.cena = cena;
        this.pamyat = pamyat;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public int getCena() {
        return cena;
    }

    public int getPamyat() {
        return pamyat;
    }

    @Override
    public String toString() {
        return nazvanie + ", цена: " + cena + " руб., память: " + pamyat + " ГБ";
    }
}