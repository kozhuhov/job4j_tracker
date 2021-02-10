package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        int len1 = o1.length();
        int len2 = o2.length();
        int lim = Math.min(len1, len2);
        for (int index = 0; index < lim; index++) {

            char c1 = o1.charAt(index);
            char c2 = o2.charAt(index);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return len1 - len2;
    }
}
