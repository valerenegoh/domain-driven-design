package com.thoughtworks.ddd.shopping.domain.bank;

public class Account {
    private Address address;

    public Account(Address address) {
        this.address = address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }
}
