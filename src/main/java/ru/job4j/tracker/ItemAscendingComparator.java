package ru.job4j.tracker;

import java.util.Comparator;

public class ItemAscendingComparator implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2) {
        return Integer.compare(i1.getId(), i2.getId());
    }
}
