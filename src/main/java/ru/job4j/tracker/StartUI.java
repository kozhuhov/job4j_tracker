package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item = tracker.add(item);
        System.out.println(tracker.findById(item.getId()));
    }
}
