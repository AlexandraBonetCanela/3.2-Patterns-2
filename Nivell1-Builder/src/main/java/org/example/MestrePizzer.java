package org.example;

public class MestrePizzer {

    private PizzaBuilder pizzaBuilder;

    public MestrePizzer(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePizza() {
        return pizzaBuilder.build();
    }
}
