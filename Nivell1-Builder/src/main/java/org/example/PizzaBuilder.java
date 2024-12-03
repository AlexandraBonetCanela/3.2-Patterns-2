package org.example;

import java.util.ArrayList;

public interface PizzaBuilder {

    void setSize(String size);

    void setDoughType(String doughType);

    void setToppings(ArrayList<String> toppings);

    Pizza build();
}
