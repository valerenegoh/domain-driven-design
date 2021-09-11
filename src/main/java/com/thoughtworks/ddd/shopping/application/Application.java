package com.thoughtworks.ddd.shopping.application;

import com.thoughtworks.ddd.shopping.domain.*;
import com.thoughtworks.ddd.shopping.domain.product.GMCricketBat;
import com.thoughtworks.ddd.shopping.domain.product.HeroInkPen;
import com.thoughtworks.ddd.shopping.domain.product.IPadPro;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Item(new IPadPro(), 1));
        cart.add(new Item(new HeroInkPen(), 1));
        cart.add(new Item(new GMCricketBat(), 2));
    }
}
