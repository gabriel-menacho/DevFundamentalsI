package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int id;
    private String ownerId;
    private List<Transaction> transactions;
    private double total;

    public Account(int id, String ownerId) {
        this.id = id;
        this.ownerId = ownerId;
        this.total = 1000;
        transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    private void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return this.total;
    }

    public void addTransaction(Transaction transaction) {
        double amount = transaction.getAmount();
        double total = getTotal();
        switch (transaction.getType()) {
            case DEPOSIT:
                setTotal(total + amount);
                break;
            case WITHDRAW:
                setTotal(total - amount);
                break;
        }
        transactions.add(transaction);
    }

    public String getOwnerId() {
        return ownerId;
    }
}
