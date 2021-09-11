package com.thoughtworks.ddd.shopping.domain.event;

import com.thoughtworks.ddd.shopping.domain.Item;

import java.util.List;

public class CartCheckedOutEvent {
    private final List<Item> items;

    public CartCheckedOutEvent(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}
