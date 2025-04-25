package com.learn.task2.ex_2;

public class VehicleFactory {
    protected String make;

    public VehicleFactory(String make) {
        this.make = make;
    }

    public Car getCar() {
        return new Car(make);
    }

    public Truck getTruck() {
        return new Truck(make);
    }

    public Motorcycle getMotorcycle() {
        return new Motorcycle(make);
    }

}
