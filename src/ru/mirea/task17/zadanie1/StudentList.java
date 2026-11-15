package ru.mirea.task17.zadanie1;

public class StudentList {

    // Узел списка: данные + ссылка на следующий узел
    private static class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head; // первый узел
    private int size;  // количество элементов

    // Создание пустого списка
    public StudentList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    // Добавление в конец
    public void add(Student s) {
        Node node = new Node(s);
        if (head == null) {
            head = node;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
        size++;
    }

    // Удаление по номеру (с 1)
    public boolean remove(int number) {
        if (number < 1 || number > size) {
            return false;
        }
        if (number == 1) {
            head = head.next;
        } else {
            Node prev = head;
            for (int i = 1; i < number - 1; i++) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }
        size--;
        return true;
    }

    // Вывод одного элемента по номеру (с 1)
    public boolean printAt(int number) {
        if (number < 1 || number > size) {
            return false;
        }
        Node cur = head;
        for (int i = 1; i < number; i++) {
            cur = cur.next;
        }
        cur.data.print();
        return true;
    }

    // Вывод всех элементов
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Node cur = head;
        int i = 1;
        while (cur != null) {
            System.out.print(i + ") ");
            cur.data.print();
            cur = cur.next;
            i++;
        }
    }

    // Очистка списка
    public void clear() {
        head = null;
        size = 0;
    }
}