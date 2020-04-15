package org.example.controller;

import org.example.controller.operators.BalanceOperator;
import org.example.controller.operators.DepositOperator;
import org.example.controller.operators.WithdrawOperator;
import org.example.controller.providers.AccountsByOwnerProvider;
import org.example.model.persistence.DataSaverInMemory;

public class ControllerManager {

    public BankAccountController getAccountController() {
        return new BankAccountController(
                new WithdrawOperator(new DataSaverInMemory()),
                new DepositOperator(new DataSaverInMemory()),
                new BalanceOperator(new DataSaverInMemory())
        );
    }

    public OwnerController getOwnerController() {
        return new OwnerController(new AccountsByOwnerProvider(new DataSaverInMemory()));
    }
}
