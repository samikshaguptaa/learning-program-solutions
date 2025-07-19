package com.cognizant.account.model;

public class Account {
    private final String number;
    private final String type;
    private final int balance;

    public Account(String number, String type, int balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public int getBalance() {
        return balance;
    }
}
