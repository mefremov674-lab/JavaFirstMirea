package ru.mirea.task19.zadanie2;

public class LabClass {
    private final Student[] students;

    public LabClass(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void sortByAverageGrade() {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getAverageGrade() < current.getAverageGrade()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }

    public Student findByFio(String fio) throws StudentNotFoundException {
        if (fio == null || fio.trim().isEmpty()) {
            throw new EmptyStringException("Search string is empty");
        }
        for (Student s : students) {
            if (s.getFio().equalsIgnoreCase(fio.trim())) {
                return s;
            }
        }
        throw new StudentNotFoundException("Student not found: " + fio);
    }
}