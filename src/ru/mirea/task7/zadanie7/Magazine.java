package ru.mirea.task7.zadanie7;

public class Magazine implements Printable {
    private String nazvanie;
    private int nomer;

    public Magazine(String nazvanie, int nomer) {
        this.nazvanie = nazvanie;
        this.nomer = nomer;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    @Override
    public void print() {
        System.out.printf("Журнал «%s», выпуск №%d%n", nazvanie, nomer);
    }

    public static void printMagazines(Printable[] printable) {
        System.out.println("Журналы:");
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                Magazine zhurnal = (Magazine) p;
                System.out.println("  " + zhurnal.getNazvanie());
            }
        }
    }
}