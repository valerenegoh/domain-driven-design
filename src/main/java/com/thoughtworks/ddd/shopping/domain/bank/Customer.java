package com.thoughtworks.ddd.shopping.domain.bank;

import java.util.List;

public class Customer {
    private final List<Account> accountList;
    private Address address;

    public Customer(List<Account> accountList, Address address) {
        this.accountList = accountList;
        this.address = address;
    }

    public void updateAddress(Address address) {
        this.address = address;
        for (Account account: accountList) {
            account.updateAddress(address);
        }
    }
}
