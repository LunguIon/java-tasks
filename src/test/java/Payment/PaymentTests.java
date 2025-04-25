package Payment;


import com.learn.task2.ex_1.PaymentService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PaymentTests {
    private PaymentService payment;

    @Before
    public void setUp(){
        payment = new PaymentService();
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

    @Test
        public void testChangePaymentMethodWrongPayment() {
        assertThrows(IllegalStateException.class, () ->
            payment.processPayment("Revolut"));
    }

}
