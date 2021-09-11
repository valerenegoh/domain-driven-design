package com.thoughtworks.ddd.shopping.adapter.producer;

import com.thoughtworks.ddd.shopping.adapter.MessageBus;
import com.thoughtworks.ddd.shopping.domain.event.CartCheckedOutEvent;

public class CartPublisher {
    public static void publish(CartCheckedOutEvent cartCheckedOutEvent) {
        MessageBus.listOfEvents.add(cartCheckedOutEvent);
    }
}
