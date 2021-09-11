package com.thoughtworks.ddd.shopping.application;

import com.thoughtworks.ddd.shopping.domain.*;
import com.thoughtworks.ddd.shopping.domain.product.GMCricketBat;
import com.thoughtworks.ddd.shopping.domain.product.HeroInkPen;
import com.thoughtworks.ddd.shopping.domain.product.IPadPro;

import java.math.BigDecimal;
import java.util.Currency;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Item(new IPadPro(new Price(Currency.getInstance("USD"), BigDecimal.valueOf(2000))), 1));
        cart.add(new Item(new HeroInkPen(new Price(Currency.getInstance("USD"), BigDecimal.valueOf(1))), 1));
        cart.add(new Item(new GMCricketBat(new Price(Currency.getInstance("SGD"), BigDecimal.valueOf(100))), 2));
    }
}
