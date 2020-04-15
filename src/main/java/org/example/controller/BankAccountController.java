package org.example.controller;

import org.example.controller.interfaces.IAccountOperator;

public class BankAccountController {
    private IAccountOperator depositOperator;
    private IAccountOperator withdrawOperator;
    private IAccountOperator balanceOperator;

    public BankAccountController(IAccountOperator withdrawOperator, IAccountOperator depositOperator, IAccountOperator balanceOperator) {
        this.withdrawOperator = withdrawOperator;
        this.depositOperator = depositOperator;
        this.balanceOperator = balanceOperator;
    }

    public void withdraw(int accountId, double amount) {
        this.withdrawOperator.execute(accountId, amount);
    }

    public void showTransactions(int accountId) {
    }

    public void showBalance(int accountId) {
        this.balanceOperator.execute(accountId, 0.0);
    }

    public void deposit(int accountId, double amount) {
        this.depositOperator.execute(accountId, amount);
    }
}
