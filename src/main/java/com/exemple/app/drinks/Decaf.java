package com.exemple.app.drinks;

import com.exemple.app.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }
    public double cost() {
        return 0.99;
    }
}
