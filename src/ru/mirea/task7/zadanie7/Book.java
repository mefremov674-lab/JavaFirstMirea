package ru.mirea.task7.zadanie7;

public class Book implements Printable {
    private String nazvanie;
    private String avtor;
    private int god;

    public Book(String nazvanie, String avtor, int god) {
        this.nazvanie = nazvanie;
        this.avtor = avtor;
        this.god = god;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    @Override
    public void print() {
        System.out.printf("Книга «%s» (автор %s), %d год%n", nazvanie, avtor, god);
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("Книги:");
        for (Printable p : printable) {
            if (p instanceof Book) {
                Book kniga = (Book) p;
                System.out.println("  " + kniga.getNazvanie());
            }
        }
    }
}