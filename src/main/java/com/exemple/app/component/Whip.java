package com.exemple.app.component;

import com.exemple.app.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.1+beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
