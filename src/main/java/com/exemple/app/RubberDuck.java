package com.exemple.app;

import com.exemple.app.flyable.FlyNoWay;
import com.exemple.app.quackable.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyableBehavior = new FlyNoWay();
    }

    @Override
    protected void display() {
        System.out.println("rubber duck");
    }

}
