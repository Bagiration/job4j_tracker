package ru.job4j.tracker;

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

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] itemsWhisoutNull = new Item[items.length];
        int dim = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                itemsWhisoutNull[dim] = items[i];
                dim++;
            }
        }
        return Arrays.copyOf(itemsWhisoutNull, dim);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item1) {
        int index = indexOf(id);
        boolean temp = false;
        if (index != -1) {
            items[index] = item1;
            items[index].setId(id);
            temp = true;
        }
        return temp;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean temp = false;
        if (index != -1) {
        items[index] = null;
        System.arraycopy(items, index + 1, items,index, size - index);
        items[size - 1] = null;
        size--;
            temp = true;
        }
        return temp;
    }
}