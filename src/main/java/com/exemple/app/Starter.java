package com.exemple.app;

public class Starter {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("cheese");
        System.out.println();
        pizzaStore.orderPizza("pepperoni");
    }
}
