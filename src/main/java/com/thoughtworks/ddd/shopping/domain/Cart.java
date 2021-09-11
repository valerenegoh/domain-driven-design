package com.thoughtworks.ddd.shopping.domain;

import java.util.*;

public class Cart {

    private final List<Item> items;
    private final Map<Action, Item> history;

    public Cart() {
        this.items = new ArrayList<>();
        history = new HashMap<>();
    }

    public void add(final Item item) {
        items.add(item);
        history.put(Action.ADD, item);
    }

    public void remove(final Item item) {
        items.remove(item);
        history.put(Action.DELETE, item);
    }

    public List<Item> getItems() {
        return items;
    }

    public Map<Action, Item> getHistory() {
        return history;
    }
}
