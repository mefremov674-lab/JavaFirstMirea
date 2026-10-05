package ru.mirea.task7.zadanie7;

public class PrintTest {
    public static void main(String[] args) {
        Printable[] izdaniya = {
                new Book("Война и мир", "Л. Н. Толстой", 1869),
                new Magazine("Хакер", 245),
                new Book("Отцы и дети", "И. С. Тургенев", 1862),
                new Magazine("Наука и жизнь", 10),
                new Book("Мастер и Маргарита", "М. А. Булгаков", 1967)
        };

        System.out.println("Все издания:");
        for (Printable p : izdaniya) {
            p.print();
        }

        System.out.println();
        Magazine.printMagazines(izdaniya);

        System.out.println();
        Book.printBooks(izdaniya);
    }
}