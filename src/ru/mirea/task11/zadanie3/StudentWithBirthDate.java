package ru.mirea.task11.zadanie3;

import ru.mirea.task9.zadanie1.Student;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StudentWithBirthDate extends Student {
    private Date birthDate;

    public StudentWithBirthDate(int iDNumber, String name, String surname,
                                String specialty, int course, String group, double gpa,
                                int year, int month, int day) {
        super(iDNumber, name, surname, specialty, course, group, gpa);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, 0, 0, 0);   // месяц в Calendar с нуля
        birthDate = cal.getTime();
    }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    // Дата рождения в заданном формате: "short", "medium" или "full"
    public String getBirthDateString(String format) {
        Locale ru = new Locale("ru");
        SimpleDateFormat sdf;
        if (format.equals("short")) {
            sdf = new SimpleDateFormat("dd.MM.yy", ru);
        } else if (format.equals("medium")) {
            sdf = new SimpleDateFormat("d MMM yyyy", ru);
        } else if (format.equals("full")) {
            sdf = new SimpleDateFormat("EEEE, d MMMM yyyy", ru);
        } else {
            return "неизвестный формат";
        }
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        return super.toString() + ", дата рождения: " + getBirthDateString("medium");
    }
}