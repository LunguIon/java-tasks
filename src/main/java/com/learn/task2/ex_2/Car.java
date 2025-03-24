package com.learn.task2.ex_2;

public class Car extends Vehicle{
    public Car(String make) {
        super(make);
    }

    @Override
    public String go() {
        return "The " + make + " Car is running";
    }
}
