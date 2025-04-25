package com.learn.task2.ex_2;

public class Car extends Vehicle{
    String localMake;

    public Car(String make) {
        this.localMake = make;
    }

    @Override
    public String go() {
        return "The " +  localMake + " Car is running";
    }
}
