package com.learn.task2.ex_1;

public class PaymentService {

    public String processPayment(String type) {
        Payment pay = new PaymentFactory().payWith(type);
        return pay.runPayment();
    }
}
