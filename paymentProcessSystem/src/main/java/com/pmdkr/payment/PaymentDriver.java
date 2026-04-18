package com.pmdkr.payment;

public class PaymentDriver {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("1234-5678", "Pramod");
        Payment p2 = new UPIPayment("pramod@upi");
        Payment p3 = new PaypalPayment("pramod@paypal");


        p1.pay(1000);
        p2.pay(2000);
        p3.pay(3000);

    }
}
