package com.thoughtworks.ddd.shopping.domain.product;

import com.thoughtworks.ddd.shopping.domain.Price;

public abstract class Product {
    private final Price price;
    private final double weight;

    protected Product(Price price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public Price getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
