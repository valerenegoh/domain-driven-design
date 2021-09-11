package com.thoughtworks.ddd.shopping.domain;

import com.thoughtworks.ddd.shopping.domain.product.IPadPro;
import org.junit.jupiter.api.Test;

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

        cart.add(new Item(new IPadPro(), 1));

        assertEquals(cart.getItems().size(), 1);
    }

    @Test
    void shouldRemoveProduct() {
        Cart cart = new Cart();
        IPadPro product = new IPadPro();
        Item item = new Item(product, 1);

        cart.add(item);
        cart.remove(item);

        assertEquals(cart.getItems().size(), 0);
    }

    @Test
    void shouldHaveHistoryOfActionsPerformedOnCart() {
        Cart cart = new Cart();
        IPadPro product = new IPadPro();
        Item item = new Item(product, 1);

        cart.add(item);
        cart.remove(item);

        assertEquals(cart.getHistory().size(), 2);
        assertEquals(cart.getHistory().get(Action.ADD), item);
    }

    @Test
    void shouldDifferentiateTwoCartsWithEqualItems() {
        IPadPro product = new IPadPro();
        Item item = new Item(product, 1);

        Cart cart1 = new Cart();
        cart1.add(item);

        Cart cart2 = new Cart();
        cart2.add(item);

        assertNotEquals(cart1, cart2);
    }
}