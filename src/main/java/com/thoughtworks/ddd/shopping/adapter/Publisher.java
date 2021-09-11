package com.thoughtworks.ddd.shopping.adapter;

import com.thoughtworks.ddd.shopping.domain.event.CartCheckedOutEvent;

public class Publisher {
    public static void publish(CartCheckedOutEvent cartCheckedOutEvent) {
        MessageBus.checkedOutEventArrayList.add(cartCheckedOutEvent);
    }
}
