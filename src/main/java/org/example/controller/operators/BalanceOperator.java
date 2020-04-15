package org.example.controller.operators;

import org.example.controller.interfaces.IInfoProvider;
import org.example.model.interfaces.IDataSaver;

public class BalanceOperator implements IInfoProvider<Double, Integer> {

    private IDataSaver dataSaver;

    public BalanceOperator(IDataSaver dataSaver) {
        this.dataSaver = dataSaver;
    }

    @Override
    public Double get(Integer id) {
        return dataSaver.getAccountById(id).getTotal();
    }
}
