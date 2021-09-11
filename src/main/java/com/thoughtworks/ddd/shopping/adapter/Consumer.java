package com.thoughtworks.ddd.shopping.adapter;

import com.thoughtworks.ddd.shopping.domain.event.Event;

public class Consumer {
    public static Event consume() {
        return MessageBus.listOfEvents.remove(0);
    }
}
