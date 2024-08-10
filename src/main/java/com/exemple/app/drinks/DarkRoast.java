package com.exemple.app.drinks;

import com.exemple.app.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    public double cost() {
        return 1.32;
    }
}
