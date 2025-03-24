package com.learn.task2.ex_2;

public class Motorcycle extends Vehicle{
    public Motorcycle(String make)  {
        super(make);
    }

    @Override
    public String go() {
        return "The " + make + " Motorcycle is running";
    }
}
