package com.pmdkr.payment;

public class UPIPayment implements Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;

    }

    public String getUpiId() {
        return upiId;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment ...");
        System.out.println("UPI id : " + upiId);
        System.out.println("Amount paid: " + amount);
    }
}
