package com.thoughtworks.ddd.shopping.domain;

import com.thoughtworks.ddd.shopping.domain.product.Product;

public class Item {
    private final Product product;
    private final int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
