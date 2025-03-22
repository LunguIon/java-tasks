package com.learn.task2.ex_1;

public class PayPalPayment extends Payment{

    @Override
    public String runPayment() {
        return "PayPal payment processed successfully";
    }

}
