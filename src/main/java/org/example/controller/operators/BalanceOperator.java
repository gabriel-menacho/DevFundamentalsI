package org.example.controller.operators;

import org.example.controller.interfaces.IAccountOperator;
import org.example.model.Account;
import org.example.model.interfaces.IDataSaver;

public class BalanceOperator implements IAccountOperator {

    private IDataSaver dataSaver;

    public BalanceOperator(IDataSaver dataSaver) {
        this.dataSaver = dataSaver;
    }
    @Override
    public boolean execute(int id, double amount) {
        Account account = dataSaver.getAccountById(id);
        System.out.println("Balance: " + account.getTotal());
        return true;
    }
}
