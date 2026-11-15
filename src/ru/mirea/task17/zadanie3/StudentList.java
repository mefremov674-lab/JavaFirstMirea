package ru.mirea.task17.zadanie3;

public class StudentList {

    // Узел кольцевого списка: данные + ссылка на следующий узел
    private static class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node tail; // последний узел; его next указывает на первый узел
    private int size;

    // Создание пустого списка
    public StudentList() {
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public int size() {
        return size;
    }

    // Добавление в конец
    public void add(Student s) {
        Node node = new Node(s);
        if (tail == null) {
            node.next = node; // единственный узел ссылается сам на себя
        } else {
            node.next = tail.next; // новый узел указывает на первый
            tail.next = node;      // бывший последний указывает на новый
        }
        tail = node;
        size++;
    }

    // Удаление по номеру (с 1)
    public boolean remove(int number) {
        if (number < 1 || number > size) {
            return false;
        }
        if (size == 1) {
            tail = null;
        } else {
            Node prev = tail; // узел перед удаляемым
            for (int i = 1; i < number; i++) {
                prev = prev.next;
            }
            Node removed = prev.next;
            prev.next = removed.next;
            if (removed == tail) {
                tail = prev;
            }
        }
        size--;
        return true;
    }

    // Вывод одного элемента по номеру (с 1)
    public boolean printAt(int number) {
        if (number < 1 || number > size) {
            return false;
        }
        Node cur = tail.next;
        for (int i = 1; i < number; i++) {
            cur = cur.next;
        }
        cur.data.print();
        return true;
    }

    // Вывод всех элементов (один круг)
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Node cur = tail.next;
        for (int i = 1; i <= size; i++) {
            System.out.print(i + ") ");
            cur.data.print();
            cur = cur.next;
        }
    }

    // Обход по кругу: steps шагов подряд, после последнего элемента снова первый
    public void printCircle(int steps) {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Node cur = tail.next;
        for (int i = 0; i < steps; i++) {
            cur.data.print();
            cur = cur.next;
        }
    }

    // Очистка списка
    public void clear() {
        tail = null;
        size = 0;
    }
}