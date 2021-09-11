package com.thoughtworks.ddd.shopping.adapter;

import com.thoughtworks.ddd.shopping.domain.event.Event;

import java.util.ArrayList;
import java.util.List;

public class MessageBus {
    public static List<Event> listOfEvents = new ArrayList<>();
}
