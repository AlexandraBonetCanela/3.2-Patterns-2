package org.example;

import org.example.enums.Dough;
import org.example.enums.Size;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MestrePizzer cheff = new MestrePizzer();

        HawaianaBuilder order1 = new HawaianaBuilder();

        List<String> order1ExtraToppings = Arrays.asList("Burrata", "Mayonese");

        Pizza hawaianPizza = cheff.makePizza(order1, Size.SMALL, Dough.CRISPY, order1ExtraToppings);
        System.out.println(hawaianPizza);

        HawaianaBuilder order2 = new HawaianaBuilder();
        List<String> order2ExtraToppings = Arrays.asList("Melon", "Strawberries");

        Pizza hawaianPizza2 = cheff.makePizza(order2, Size.MEDIUM, Dough.THICK, order2ExtraToppings);
        System.out.println(hawaianPizza2);
    }
}