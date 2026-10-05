package ru.mirea.task2.zadanie1;

public class TestAuthor {
    public static void main(String[] args) {
        Author avtor = new Author("Ефремов Миша", "misha@gmail.com", 'м');

        System.out.println(avtor);

        System.out.println("Имя: " + avtor.getName());
        System.out.println("Почта: " + avtor.getEmail());
        System.out.println("Пол: " + avtor.getGender());

        avtor.setEmail("misha1@mail.ru");
        System.out.println("После смены почты: " + avtor);
    }
}