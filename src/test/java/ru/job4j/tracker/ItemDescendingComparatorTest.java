package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemDescendingComparatorTest {

    @Test
    public void testCompare() {
        List<Item> list = Arrays.asList(
                new Item(0, "first"),
                new Item(1, "second"),
                new Item(2, "third")
        );

        List<Item> expected = Arrays.asList(
                new Item(2, "third"),
                new Item(1, "second"),
                new Item(0, "first")
        );

        Collections.sort(list, new ItemDescendingComparator());
        Assert.assertTrue(Arrays.equals(expected.toArray(), list.toArray()));
    }
}