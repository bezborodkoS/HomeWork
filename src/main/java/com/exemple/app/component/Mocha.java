package com.exemple.app.component;

import com.exemple.app.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.20+beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
