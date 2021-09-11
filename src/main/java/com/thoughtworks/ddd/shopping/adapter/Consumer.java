package com.thoughtworks.ddd.shopping.adapter;

import com.thoughtworks.ddd.shopping.domain.event.CartCheckedOutEvent;

public class Consumer {
    public static CartCheckedOutEvent consume(){
        return MessageBus.checkedOutEventArrayList.remove(0);
    }
}
