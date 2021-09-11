package com.thoughtworks.ddd.shopping.domain;

import com.thoughtworks.ddd.shopping.domain.product.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private final Map<Product, Integer> products;

    public Order(List<Item> itemList) {
        this.products = new HashMap<>();
        for (Item item : itemList) {
            Product product = item.getProduct();
            this.products.put(product, this.products.getOrDefault(product, 0) + item.getQuantity());
        }
    }
}
