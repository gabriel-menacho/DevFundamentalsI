package org.example.controller.operators;

import org.example.controller.interfaces.IInfoProvider;
import org.example.model.Transaction;
import org.example.model.interfaces.IDataSaver;

import java.util.List;

public class TransactionOperator implements IInfoProvider<List<Transaction>, Integer> {

    private IDataSaver dataSaver;

    public TransactionOperator(IDataSaver dataSaver) {
        this.dataSaver = dataSaver;
    }

    @Override
    public List<Transaction> get(Integer id) {
        return dataSaver.getAccountById(id).getTransactions();
    }
}
