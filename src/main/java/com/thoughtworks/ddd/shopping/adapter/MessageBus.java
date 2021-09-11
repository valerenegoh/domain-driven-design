package com.thoughtworks.ddd.shopping.adapter;

import com.thoughtworks.ddd.shopping.domain.event.CartCheckedOutEvent;

import java.util.ArrayList;
import java.util.List;

class MessageBus {
    public static List<CartCheckedOutEvent> checkedOutEventArrayList = new ArrayList<>();
}
