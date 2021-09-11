package com.thoughtworks.ddd.shopping.domain;

import java.math.BigDecimal;
import java.util.*;

public class Price {
    private final Currency currency;
    private final BigDecimal value;

    public Price(Currency currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(currency, price.currency) && Objects.equals(value, price.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, value);
    }
}
