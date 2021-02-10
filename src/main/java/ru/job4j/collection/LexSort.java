package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {

        if (left.length() == 0 || right.length() == 0) {
            return left.length() - right.length();
        }

        String[] leftParts = left.split(". ");
        String[] rightParts = right.split(". ");

        Integer leftNum = Integer.parseInt(leftParts[0]);
        Integer rightNum = Integer.parseInt(rightParts[0]);

        return leftNum - rightNum;
    }
}