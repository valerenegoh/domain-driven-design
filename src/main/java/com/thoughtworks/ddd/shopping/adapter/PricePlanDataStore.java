package com.thoughtworks.ddd.shopping.adapter;

import com.thoughtworks.ddd.shopping.domain.Price;
import com.thoughtworks.ddd.shopping.domain.product.*;

import java.math.BigDecimal;
import java.util.*;

public class PricePlanDataStore {
    public static Map<Class<? extends Product>, Price> competitorPriceMap = Map.of(
        IPadPro.class, new Price(Currency.getInstance("USD"), BigDecimal.valueOf(1000)),
        HeroInkPen.class, new Price(Currency.getInstance("USD"), BigDecimal.valueOf(2)),
        GMCricketBat.class, new Price(Currency.getInstance("USD"), BigDecimal.valueOf(80))
    );
}
