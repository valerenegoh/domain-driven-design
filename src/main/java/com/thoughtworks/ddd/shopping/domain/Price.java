package com.thoughtworks.ddd.shopping.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {
    private final Currency currency;
    private final BigDecimal value;

    public Price(Currency currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }
}
