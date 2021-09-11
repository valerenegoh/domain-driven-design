package com.thoughtworks.ddd.shopping.application;

import com.thoughtworks.ddd.shopping.adapter.consumer.CartEventConsumer;
import com.thoughtworks.ddd.shopping.domain.*;
import com.thoughtworks.ddd.shopping.domain.bank.*;
import com.thoughtworks.ddd.shopping.domain.event.CartCheckedOutEvent;
import com.thoughtworks.ddd.shopping.domain.product.GMCricketBat;
import com.thoughtworks.ddd.shopping.domain.product.HeroInkPen;
import com.thoughtworks.ddd.shopping.domain.product.IPadPro;
import com.thoughtworks.ddd.shopping.domain.service.PricePlanStrategy;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        IPadPro ipadPro = new IPadPro(PricePlanStrategy.discountedPrice(IPadPro.class), 800);
        cart.add(new Item(ipadPro, 1));
        cart.add(new Item(new HeroInkPen(PricePlanStrategy.discountedPrice(HeroInkPen.class), 0.1), 1));
        cart.add(new Item(new GMCricketBat(PricePlanStrategy.discountedPrice(GMCricketBat.class), 500), 2));

        cart.checkout();
        Order order = new Order(CartEventConsumer.consume().getItems());
        System.out.println(order);
        System.out.println(order.getTotalCost());

        Customer customer = new Customer(List.of(new Account(new Address("City1"))), new Address("City1"));
        customer.updateAddress(new Address("City2"));
    }
}
