package com.mmg;

public class HealthReport implements Report {
    @Override
    public void load() {
        System.out.println("HealthReport Load");
    }

    @Override
    public void print() {
        System.out.println("HealthReport Print");
    }
}
