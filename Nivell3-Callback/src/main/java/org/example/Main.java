package org.example;

public class Main {
    public static void main(String[] args) {

        Task shoeShop = new ShoeShop();
        Callback creditcard = new CreditCard();
        Callback paypal = new Paypal();
        Callback debt = new Debt();
        shoeShop.executeWith(creditcard);
        shoeShop.executeWith(paypal);
        shoeShop.executeWith(debt);
    }
}