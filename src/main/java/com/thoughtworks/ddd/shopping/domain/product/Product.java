package com.thoughtworks.ddd.shopping.domain.product;

import com.thoughtworks.ddd.shopping.domain.Price;

public abstract class Product {
    private final Price price;

    protected Product(Price price) {
        this.price = price;
    }


}
