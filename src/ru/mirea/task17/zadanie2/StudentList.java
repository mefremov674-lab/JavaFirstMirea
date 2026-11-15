package ru.mirea.task17.zadanie2;

public class StudentList {

    // Узел двусвязного списка: данные + ссылки на предыдущий и следующий узлы
    private static class Node {
        Student data;
        Node prev;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head; // первый узел
    private Node tail; // последний узел
    private int size;

    // Создание пустого списка
    public StudentList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    // Добавление в конец (проходить весь список не нужно, есть tail)
    public void add(Student s) {
        Node node = new Node(s);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    // Поиск узла по номеру (с 1)
    private Node getNode(int number) {
        if (number < 1 || number > size) {
            return null;
        }
        Node cur = head;
        for (int i = 1; i < number; i++) {
            cur = cur.next;
        }
        return cur;
    }

    // Удаление по номеру (с 1)
    public boolean remove(int number) {
        Node node = getNode(number);
        if (node == null) {
            return false;
        }
        if (node.prev == null) {
            head = node.next;
        } else {
            node.prev.next = node.next;
        }
        if (node.next == null) {
            tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }
        size--;
        return true;
    }

    // Вывод одного элемента по номеру (с 1)
    public boolean printAt(int number) {
        Node node = getNode(number);
        if (node == null) {
            return false;
        }
        node.data.print();
        return true;
    }

    // Вывод всех элементов от начала к концу
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

    // Вывод всех элементов от конца к началу
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Node cur = tail;
        int i = size;
        while (cur != null) {
            System.out.print(i + ") ");
            cur.data.print();
            cur = cur.prev;
            i--;
        }
    }

    // Очистка списка
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}