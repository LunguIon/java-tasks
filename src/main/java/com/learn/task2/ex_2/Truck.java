package com.learn.task2.ex_2;

public class Truck extends Vehicle{
    public Truck(String make)  {
        super(make);
    }

    @Override
    public String go() {
        return "The " + make + " Truck is running";
    }
}
