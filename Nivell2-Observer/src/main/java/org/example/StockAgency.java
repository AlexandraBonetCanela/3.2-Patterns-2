package org.example;

public class StockAgency implements Observer{

    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Agency " + name + " StockExchange: " + message);
    }
}
