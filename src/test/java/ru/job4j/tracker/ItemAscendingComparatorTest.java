package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ItemAscendingComparatorTest {

    @Test
    public void testCompare() {
        List<Item> list = Arrays.asList(
                new Item(0, "first"),
                new Item(1, "second"),
                new Item(2, "third")
        );

        List<Item> expected = Arrays.asList(
                new Item(0, "first"),
                new Item(1, "second"),
                new Item(2, "third")
        );

        Collections.sort(list, new ItemAscendingComparator());
        Assert.assertTrue(Arrays.equals(expected.toArray(), list.toArray()));
    }
}