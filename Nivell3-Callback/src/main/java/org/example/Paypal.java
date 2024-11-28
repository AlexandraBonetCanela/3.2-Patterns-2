package org.example;

public class Paypal implements Callback{

    @Override
    public void call() {
        System.out.println("Paypal");
    }
}
