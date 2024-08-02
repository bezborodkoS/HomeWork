package com.exemple.app;

import com.exemple.app.flyable.FlyNoWay;
import com.exemple.app.quackable.QuackBehavior;
import com.exemple.app.quackable.Squeak;

public class RubberDuck extends Duck implements QuackBehavior {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyableBehavior = new FlyNoWay();
    }

    @Override
    protected void display() {
        System.out.println("rubber duck");
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }
}
