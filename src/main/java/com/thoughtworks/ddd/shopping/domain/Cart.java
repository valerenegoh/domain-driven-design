package com.thoughtworks.ddd.shopping.domain;

import com.thoughtworks.ddd.shopping.adapter.producer.CartPublisher;
import com.thoughtworks.ddd.shopping.domain.event.CartCheckedOutEvent;

import java.util.*;

public class Cart {
    private final List<Item> items;
    private final Map<Action, Item> history;
    private Boolean isCheckedOut;

    public Cart() {
        this.items = new ArrayList<>();
        this.history = new HashMap<>();
        this.isCheckedOut = false;
    }

    public void add(final Item item) {
        items.add(item);
        history.put(Action.ADD, item);
    }

    public void remove(final Item item) {
        items.remove(item);
        history.put(Action.DELETE, item);
    }

    public void checkout() {
        CartPublisher.publish(new CartCheckedOutEvent(items));
        this.isCheckedOut = true;
    }

    public List<Item> getItems() {
        return items;
    }

    public Map<Action, Item> getHistory() {
        return history;
    }
}
