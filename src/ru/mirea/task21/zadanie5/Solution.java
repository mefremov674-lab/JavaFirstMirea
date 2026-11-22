package ru.mirea.task21.zadanie5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    @SafeVarargs
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    @SafeVarargs
    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static void main(String[] args) {
        ArrayList<String> list = newArrayList("a", "b", "c");
        System.out.println(list);

        HashSet<Integer> set = newHashSet(1, 2, 3, 2, 1);
        System.out.println(set);

        Map<Integer, String> source = new HashMap<>();
        source.put(1, "one");
        source.put(2, "two");
        HashMap<Number, Object> map = newHashMap(source);
        System.out.println(map);
    }
}