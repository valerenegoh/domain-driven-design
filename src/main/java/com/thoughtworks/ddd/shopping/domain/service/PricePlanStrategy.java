package com.thoughtworks.ddd.shopping.domain.service;

import com.thoughtworks.ddd.shopping.adapter.PricePlanDataStore;
import com.thoughtworks.ddd.shopping.domain.Price;
import com.thoughtworks.ddd.shopping.domain.product.Product;

import java.math.BigDecimal;

public class PricePlanStrategy {

    public static final BigDecimal DISCOUNT = BigDecimal.valueOf(0.9);

    public static Price discountedPrice(Class<? extends Product> product) {
        Price price = PricePlanDataStore.competitorPriceMap.get(product);
        return new Price(price.getCurrency(), price.getValue().multiply(DISCOUNT));
    }
}
