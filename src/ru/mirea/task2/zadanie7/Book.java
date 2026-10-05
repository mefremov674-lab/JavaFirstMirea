package ru.mirea.task2.zadanie7;

public class Book {
    private String avtor;
    private String nazvanie;
    private int god;

    public Book(String avtor, String nazvanie, int god) {
        this.avtor = avtor;
        this.nazvanie = nazvanie;
        this.god = god;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    @Override
    public String toString() {
        return avtor + " «" + nazvanie + "», " + god;
    }
}