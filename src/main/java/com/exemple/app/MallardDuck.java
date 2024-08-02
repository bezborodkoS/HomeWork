package com.exemple.app;

import com.exemple.app.flyable.FlyWithWings;
import com.exemple.app.flyable.FlyableBehavior;
import com.exemple.app.quackable.Quack;
import com.exemple.app.quackable.QuackBehavior;

public class MallardDuck extends Duck implements FlyableBehavior, QuackBehavior {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyableBehavior = new FlyWithWings();
    }

    @Override
    protected void display() {
        System.out.println("mallard duck");
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
