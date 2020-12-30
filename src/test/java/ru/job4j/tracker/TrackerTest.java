package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenOneItemFindAllTurnOne() {
        Item item1 = new Item();
        Tracker tracker = new Tracker();
        tracker.add(item1);
        Item[] rsl = tracker.findAll();
        Assert.assertEquals(1, rsl.length);
    }
}