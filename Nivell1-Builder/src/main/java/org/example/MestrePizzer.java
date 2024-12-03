package org.example;

import org.example.enums.Dough;
import org.example.enums.Size;

import java.util.List;

public class MestrePizzer {

    public Pizza makePizza(PizzaBuilder pizzaBuilder, Size size, Dough dough, List<String> extraToppings) {
        pizzaBuilder.setSize(size);
        pizzaBuilder.setDoughType(dough);
        pizzaBuilder.addExtraToppings(extraToppings);
        return pizzaBuilder.build();
    }
}
