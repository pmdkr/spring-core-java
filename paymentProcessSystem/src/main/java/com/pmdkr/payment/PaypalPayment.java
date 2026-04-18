package com.pmdkr.payment;

public class PaypalPayment implements Payment {

    private String email;

    public PaypalPayment(String email) {
        this.email = email;

    }

    public String getEmail() {
        return email;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal Payment...");
        System.out.println("Email: " + email);
        System.out.println("Amount paid: " + amount);

    }
}
