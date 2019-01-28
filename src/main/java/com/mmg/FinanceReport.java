package com.mmg;

public class FinanceReport implements Report {
    @Override
    public void load() {
        System.out.println("FinanceReport Load");
    }

    @Override
    public void print() {
        System.out.println("FinanceReport  Print");
    }
}
