package com.thoughtworks.ddd.shopping.domain.product;

import com.thoughtworks.ddd.shopping.domain.Price;

public class GMCricketBat extends Product {
    public GMCricketBat(final Price price, final double weight) {
        super(price, weight);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
