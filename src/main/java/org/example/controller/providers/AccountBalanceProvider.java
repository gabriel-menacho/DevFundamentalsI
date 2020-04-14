package org.example.controller.providers;

import org.example.controller.interfaces.IInfoProvider;

public class AccountBalanceProvider implements IInfoProvider<Double, Integer> {
    @Override
    public Double get(Integer accountId) {
        return null;
    }
}
