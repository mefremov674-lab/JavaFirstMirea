package ru.mirea.task19.zadanie2;

import java.util.Scanner;

public class LabClassUI {
    private final LabClass labClass;
    private final Scanner scanner = new Scanner(System.in);

    public LabClassUI() {
        Student[] students = {
                new Student("Ivanov Ivan", 4.3),
                new Student("Petrov Petr", 3.8),
                new Student("Sidorova Anna", 4.9),
                new Student("Smirnov Oleg", 4.1)
        };
        labClass = new LabClass(students);
    }

    public void run() {
        while (true) {
            System.out.println("\n1 - show students");
            System.out.println("2 - sort by average grade");
            System.out.println("3 - find student by FIO");
            System.out.println("0 - exit");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    showStudents();
                    break;
                case "2":
                    labClass.sortByAverageGrade();
                    showStudents();
                    break;
                case "3":
                    findStudent();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    private void showStudents() {
        for (Student s : labClass.getStudents()) {
            System.out.println(s);
        }
    }

    private void findStudent() {
        System.out.print("Enter FIO: ");
        String fio = scanner.nextLine();
        try {
            Student s = labClass.findByFio(fio);
            System.out.println("Found: " + s);
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (EmptyStringException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}