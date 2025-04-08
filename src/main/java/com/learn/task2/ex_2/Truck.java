package com.learn.task2.ex_2;

public class Truck extends Vehicle{
    String localMake;

    public Truck(String make)  {

        this.localMake = make;
    }

    @Override
    public String go() {
        return "The " + localMake + " Truck is running";
    }
}
