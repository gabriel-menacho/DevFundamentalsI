package org.example.controller;

import org.example.controller.interfaces.IAccountOperator;
import org.example.controller.interfaces.IInfoProvider;
import org.example.controller.operators.DepositOperator;
import org.example.model.Transaction;

import java.util.List;

public class BankAccountController {
    private IAccountOperator depositOperator;
    private IAccountOperator withdrawOperator;
    private IInfoProvider<Double, Integer> balanceOperator;
    private IInfoProvider<List<Transaction>, Integer> transactionsOperator;

    public BankAccountController(
            IAccountOperator withdrawOperator,
            IAccountOperator depositOperator,
            IInfoProvider<Double, Integer> balanceOperator,
            IInfoProvider<List<Transaction>, Integer> transactionsOperator
    ) {
        this.withdrawOperator = withdrawOperator;
        this.depositOperator = depositOperator;
        this.balanceOperator = balanceOperator;
        this.transactionsOperator = transactionsOperator;
    }

    public void withdraw(int accountId, double amount) {
        this.withdrawOperator.execute(accountId, amount);
    }

    public void showTransactions(int accountId) {
        List<Transaction> transactionsList = this.transactionsOperator.get(accountId);
        System.out.println("TRANSACTIONS");
        System.out.println("---------------------------------------------------------------------------");
        transactionsList.forEach(transaction -> {
            System.out.println("Transaction: " + transaction.getType() + " : " + transaction.getAmount());
        });
        System.out.println("---------------------------------------------------------------------------");
    }

    public void showBalance(int accountId) {
        double balance = this.balanceOperator.get(accountId);
        System.out.println("Balance: " + balance);
    }

    public void deposit(int accountId, double amount) {
        this.depositOperator.execute(accountId, amount);
    }
}
