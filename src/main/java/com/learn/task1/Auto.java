package com.learn.task1;

public abstract class Auto {
    protected String brand;
    protected double price;

    public Auto(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
}
