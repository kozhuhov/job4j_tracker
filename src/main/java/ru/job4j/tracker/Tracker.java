package ru.job4j.tracker;

import ru.job4j.oop.Inheritance.Patient;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String name) {
        int rslSize = 0;
        Item[] rsl = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                rsl[rslSize++] = item;
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public boolean replace(int id, Item item) {

        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        Item tmp = items[index];
        item.setId(tmp.getId());
        items[index] = item;
        return true;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        int start = index + 1;
        int length = size - index;
        System.arraycopy(items, start, items, index, length);
        items[size-1] = null;
        return true;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index <= size; index++) {
            Item currentItem = items[index];
            if (currentItem == null) {
                continue;
            }
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}