package com.learn.task2.ex_2;

public class Motorcycle extends Vehicle{
    String localMake;

    public Motorcycle(String make)  {
        this.localMake = make;
    }

    @Override
    public String go() {
        return "The " + localMake + " Motorcycle is running";
    }
}
