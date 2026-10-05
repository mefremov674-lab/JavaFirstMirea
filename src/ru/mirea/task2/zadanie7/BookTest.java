package ru.mirea.task2.zadanie7;

public class BookTest {
    public static void main(String[] args) {
        // Проверка класса Book
        Book kniga = new Book("Пушкин", "Евгений Онегин", 1833);
        System.out.println("Книга: " + kniga);
        kniga.setGod(1832);
        System.out.println("Автор: " + kniga.getAvtor() + ", название: "
                + kniga.getNazvanie() + ", год: " + kniga.getGod());

        // Проверка книжной полки
        BookShelf polka = new BookShelf(10);
        polka.dobavit("Толстой", "Война и мир", 1869);
        polka.dobavit("Булгаков", "Мастер и Маргарита", 1967);
        polka.dobavit("Гоголь", "Мёртвые души", 1842);
        polka.dobavit("Достоевский", "Преступление и наказание", 1866);

        System.out.println("\nКниги на полке:");
        polka.pokazatVse();

        System.out.println("\nСамая новая: " + polka.samayaNovaya());
        System.out.println("Самая старая: " + polka.samayaStaraya());

        polka.sortirovat();
        System.out.println("\nПосле сортировки по году:");
        polka.pokazatVse();
    }
}