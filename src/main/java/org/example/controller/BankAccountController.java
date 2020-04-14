package org.example.controller;

import org.example.controller.interfaces.IAccountOperator;

public class BankAccountController {
    private IAccountOperator depositOperator;
    private IAccountOperator withdrawOperator;

    public BankAccountController(IAccountOperator withdrawOperator, IAccountOperator depositOperator) {
        this.withdrawOperator = withdrawOperator;
        this.depositOperator = depositOperator;
    }

    public void withdraw(int accountId, double amount) {
        this.withdrawOperator.execute(accountId, amount);
    }

    public void showTransactions(int accountId) {
    }

    public void showBalance(int accountId) {
    }

    public void deposit(int accountId, double amount) {
        this.depositOperator.execute(accountId, amount);
    }
}
