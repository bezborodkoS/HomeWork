package com.exemple.app;

import com.exemple.app.component.Milk;
import com.exemple.app.component.Whip;
import com.exemple.app.drinks.DarkRoast;
import com.exemple.app.drinks.Decaf;
import com.exemple.app.drinks.Espresso;

public class Starter {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" cost: "+beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Milk(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+" cost: "+beverage1.cost());
    }
}
