package com.exemple.app.drinks;

import com.exemple.app.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    public double cost() {
        return 0.89;
    }
}
