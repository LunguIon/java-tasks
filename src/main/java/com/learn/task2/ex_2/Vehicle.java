package com.learn.task2.ex_2;

public abstract class Vehicle {
    protected String make;
    protected Vehicle(String make) {
        this.make = make;
    }
    public abstract String go();
}
