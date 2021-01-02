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

    @Test
    public void whenOneItemFindByNameTurnOne() {
        Item item1 = new Item();
        item1.setName("Name1");
        Tracker tracker = new Tracker();
        tracker.add(item1);
        Item[] expect = {item1};
        Item[] rsl = tracker.findByName("Name1");
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}