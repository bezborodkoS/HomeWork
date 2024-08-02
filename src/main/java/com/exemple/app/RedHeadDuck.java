package com.exemple.app;

import com.exemple.app.flyable.FlyWithWings;
import com.exemple.app.flyable.FlyableBehavior;
import com.exemple.app.quackable.Quack;
import com.exemple.app.quackable.QuackBehavior;

public class RedHeadDuck extends Duck implements FlyableBehavior, QuackBehavior {
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyableBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        System.out.println("red head duck");
    }

    @Override
    public void fly() {
        flyableBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }
}
