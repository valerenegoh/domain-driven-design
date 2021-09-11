package com.thoughtworks.ddd.shopping.domain;

import com.thoughtworks.ddd.shopping.domain.product.Product;

import java.math.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private final Map<Product, Integer> products;
    private BigDecimal totalCost;

    public Order(List<Item> itemList) {
        totalCost = BigDecimal.ZERO;
        this.products = new HashMap<>();
        for (Item item : itemList) {
            Product product = item.getProduct();
            this.products.put(product, this.products.getOrDefault(product, 0) + item.getQuantity());
            totalCost = totalCost.add(product.getPrice().getValue().add(BigDecimal.valueOf(product.getWeight() * 0.01)));
        }
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }
}
