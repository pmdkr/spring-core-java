package com.pmdkr.payment;

public class CreditCardPayment implements Payment {

    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }


    @Override
    public void pay(double amount) {


        System.out.println("Processing Credit Card Payment....");
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Amount paid: " + amount);
    }
}
