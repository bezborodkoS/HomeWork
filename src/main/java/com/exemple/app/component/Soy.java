package com.exemple.app.component;

import com.exemple.app.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.12+beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
