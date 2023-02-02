package com.hao.ProjectATM;

public class Account {

    private int card;
    private String name;
    private int password;
    private double balance;
    private int limit;

    public Account() {
    }

    public Account(int card, String name, int password, double balance, int limit) {
        this.card = card;
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.limit = limit;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCard() {
        return card;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }
}
