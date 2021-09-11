package com.thoughtworks.ddd.shopping.domain;

import com.thoughtworks.ddd.shopping.adapter.MessageBus;
import com.thoughtworks.ddd.shopping.domain.product.IPadPro;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void shouldBeEmptyOnCartCreation() {
        Cart cart = new Cart();

        assertEquals(cart.getItems().size(), 0);
    }

    @Test
    void shouldAddItemToCart() {
        Cart cart = new Cart();

        cart.add(new Item(new IPadPro(new Price(Currency.getInstance("USD"), BigDecimal.valueOf(2000)), 800), 1));

        assertEquals(cart.getItems().size(), 1);
    }

    @Test
    void shouldRemoveProduct() {
        Cart cart = new Cart();
        Item item = new Item(new IPadPro(new Price(Currency.getInstance("USD"), BigDecimal.valueOf(2000)), 800), 1);

        cart.add(item);
        cart.remove(item);

        assertEquals(cart.getItems().size(), 0);
    }

    @Test
    void shouldHaveHistoryOfActionsPerformedOnCart() {
        Cart cart = new Cart();
        Item item = new Item(new IPadPro(new Price(Currency.getInstance("USD"), BigDecimal.valueOf(2000)), 800), 1);

        cart.add(item);
        cart.remove(item);

        assertEquals(cart.getHistory().size(), 2);
        assertEquals(cart.getHistory().get(Action.ADD), item);
    }

    @Test
    void shouldDifferentiateTwoCartsWithEqualItems() {
        Item item = new Item(new IPadPro(new Price(Currency.getInstance("USD"), BigDecimal.valueOf(2000)), 800), 1);

        Cart cart1 = new Cart();
        cart1.add(item);

        Cart cart2 = new Cart();
        cart2.add(item);

        assertNotEquals(cart1, cart2);
    }

    @Test
    void shouldProduceCartCheckedOutEventInEventBusWhenCartCheckoutActionOccurs() {
        Cart cart = new Cart();
        cart.checkout();
        assertEquals(MessageBus.listOfEvents.size(),1);
    }
}