package ru.job4j.tracker;

import java.util.Comparator;

public class ItemDescendingComparator implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2) {
        return Integer.compare(i2.getId(), i1.getId());
    }
}

