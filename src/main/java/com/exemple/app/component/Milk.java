package com.exemple.app.component;

import com.exemple.app.Beverage;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.35+beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription()+", Milk";
    }
}
