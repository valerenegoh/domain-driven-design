package com.thoughtworks.ddd.shopping.adapter.consumer;

import com.thoughtworks.ddd.shopping.adapter.MessageBus;
import com.thoughtworks.ddd.shopping.domain.event.CartCheckedOutEvent;

public class CartEventConsumer {
    public static CartCheckedOutEvent consume() {
        return (CartCheckedOutEvent) MessageBus.listOfEvents.remove(0);
    }
}
