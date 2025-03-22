package com.learn.task2.ex_1;

public final class PaymentFactory {

    public Payment payWith(String typeOfPayment) {
        return switch (typeOfPayment.toLowerCase()) {
            case "credit card" -> new CreditCardPayment();
            case "paypal" -> new PayPalPayment();
            default -> throw new IllegalStateException("Unexpected value: " + typeOfPayment.toLowerCase());
        };

    }
}
