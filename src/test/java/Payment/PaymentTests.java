package Payment;


import com.learn.task2.ex_1.Ex1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentTests {
    private Ex1 payment;

    @Before
    public void setUp(){
        payment = new Ex1();
    }

    @Test
    public void testChangePaymentMethodCreditCard() {
        String result = payment.processPayment("Credit Card");
        assertEquals("Credit Card payment processed successfully", result);
    }

    @Test
    public void testChangePaymentMethodPayPal() {
        String result = payment.processPayment("PayPal");
        assertEquals("PayPal payment processed successfully", result);
    }


}
