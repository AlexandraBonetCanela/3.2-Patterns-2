package org.example;

import org.example.enums.Dough;
import org.example.enums.Size;

import java.util.List;


public class Pizza {

    private Size size;
    private Dough dough;
    private List<String> toppings;

    public Pizza(Size size, Dough dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza: " + "size: " + size + ", dough: " + dough + ", toppings: " + toppings;
    }
}
