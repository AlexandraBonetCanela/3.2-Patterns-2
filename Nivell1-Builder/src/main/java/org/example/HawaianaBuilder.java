package org.example;

import org.example.enums.Dough;
import org.example.enums.Size;

import java.util.ArrayList;
import java.util.List;

public class HawaianaBuilder implements PizzaBuilder{

    private Size size;
    private Dough dough;
    private List<String> toppings = new ArrayList<>();

    public HawaianaBuilder() {
        toppings.add("tomato sauce");
        toppings.add("mozarella");
        toppings.add("pineapple");
        toppings.add("ham");
        toppings.add("onion");
    }

    @Override
    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void setDoughType(Dough doughType) {
        this.dough = doughType;
    }

    @Override
    public void addExtraToppings(List<String> toppings){
        this.toppings.addAll(toppings);
    }

    @Override
    public Pizza build() {
        return new Pizza(size, dough, toppings);
    }
}
