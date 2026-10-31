package ru.mirea.task13.zadanie2;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getShortName() {
        boolean hasName = name != null && !name.isEmpty();
        boolean hasPatronymic = patronymic != null && !patronymic.isEmpty();

        StringBuilder sb = new StringBuilder(surname.length() + 6);
        sb.append(surname);
        if (hasName || hasPatronymic) {
            sb.append(' ');
        }
        if (hasName) {
            sb.append(name.charAt(0)).append('.');
        }
        if (hasPatronymic) {
            sb.append(patronymic.charAt(0)).append('.');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Person("Иванов", "Иван", "Иванович").getShortName());
        System.out.println(new Person("Петров", "Пётр", "").getShortName());
        System.out.println(new Person("Сидоров", null, null).getShortName());
        System.out.println(new Person("Кузнецова", "", "Сергеевна").getShortName());
    }
}