package ru.mirea.task7.zadanie5;

public class ProcessStrings implements Stroki {

    @Override
    public int kolichestvoSimvolov(String s) {
        return s.length();
    }

    @Override
    public int kolichestvoSimvolov(String s, char simvol) {
        int schetchik = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == simvol) {
                schetchik++;
            }
        }
        return schetchik;
    }

    @Override
    public String nechetnyePozicii(String s) {
        StringBuilder rezultat = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            rezultat.append(s.charAt(i));
        }
        return rezultat.toString();
    }

    @Override
    public String perevernut(String s) {
        StringBuilder rezultat = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rezultat.append(s.charAt(i));
        }
        return rezultat.toString();
    }
}