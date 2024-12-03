package org.example;

import org.example.enums.Dough;
import org.example.enums.Size;

import java.util.ArrayList;

public class Pizza {

    private Size size;
    private Dough dough;
    private ArrayList<String> toppings;

    public Pizza(Size size, Dough dough, ArrayList<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza: " + "size: " + size + ", dough: " + dough + ", toppings: " + toppings;
    }
}
