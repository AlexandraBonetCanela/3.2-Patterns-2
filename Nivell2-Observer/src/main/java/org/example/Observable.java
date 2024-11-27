package org.example;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String marketState;

    public void subscribe(Observer subscriber){
        observers.add(subscriber);
    }

    public void unsubscribe(Observer subscriber){
        observers.remove(subscriber);
    }

    public void notifyObservers(){
        observers.forEach(subscriber -> subscriber.update("Market is now: " + marketState));
    }

    public void setMarketState(String marketState){
        this.marketState = marketState;
        notifyObservers();
    }
}
