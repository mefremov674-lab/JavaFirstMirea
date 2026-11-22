package ru.mirea.task21.zadanie4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryList {
    public static void main(String[] args) {
        File dir = new File(args.length > 0 ? args[0] : ".");
        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Directory not found: " + dir.getAbsolutePath());
            return;
        }

        List<String> names = new ArrayList<>();
        for (File f : files) {
            names.add(f.getName());
        }

        int count = Math.min(5, names.size());
        for (int i = 0; i < count; i++) {
            System.out.println(names.get(i));
        }
    }
}