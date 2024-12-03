package org.example;

import org.example.enums.Dough;
import org.example.enums.Size;

import java.util.List;

public interface PizzaBuilder {

    void setSize(Size size);
    void setDoughType(Dough doughType);
    void addExtraToppings(List<String> toppings);

    Pizza build();
}
