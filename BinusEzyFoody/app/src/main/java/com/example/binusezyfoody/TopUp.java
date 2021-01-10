package com.example.binusezyfoody;

public class TopUp {
    int balance;

    public int getBalance() {
        return balance;
    }

    public int setBalance(int balance) {
        this.balance += balance;
        return balance;
    }
}
